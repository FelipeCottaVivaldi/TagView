package exercise.tagview.tagviewexercise;

import android.content.Context;
import android.util.Log;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Felipe on 08/10/2015.
 */
public class FetchLocalIdRetrofit {

    private static final String TAG = FetchLocalIdRetrofit.class.getSimpleName();
    private CallbackFilmes mListener;
    RestAdapter mAdapter;

    public FetchLocalIdRetrofit(Context context, CallbackFilmes listener){
        mAdapter = new RestAdapter.Builder().setEndpoint("http://api.themoviedb.org").build();
        mListener = listener;
    }

    public void loadId(String nome){
        Service service = mAdapter.create(Service.class);
        service.getID(nome, new Callback<Ator>() {
            @Override
            public void success(Ator ator, Response response) {
                mListener.OnIdSuccess(ator);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, "Erro tentando achar id", error.getCause());
            }
        });
    }

    public void loadFilmes(Integer id){
        Service service = mAdapter.create(Service.class);
        service.getFilmes(id, new Callback<Cast>() {
            @Override
            public void success(Cast filmes, Response response) {
                mListener.OnFilmesSuccess(filmes);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, "Erro tentando achar filmes", error.getCause());
            }
        });
    }
}
