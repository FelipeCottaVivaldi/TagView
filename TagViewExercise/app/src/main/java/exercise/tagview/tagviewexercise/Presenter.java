package exercise.tagview.tagviewexercise;

import android.content.Context;

import java.util.List;

/**
 * Created by Felipe on 08/10/2015.
 */
public class Presenter implements CallbackFilmes {

    SuccessView mView;
    Context mContext;

    public Presenter(Context context, SuccessView view){
        mView = view;
        mContext = context;
    }

    public void loadIdAtor(String nome){
        new FetchLocalIdRetrofit(mContext, this).loadId(nome);
    }

    public void loadFilmesAtor(Integer id){
        new FetchLocalIdRetrofit(mContext, this).loadFilmes(id);
    }

    @Override
    public void OnIdSuccess(Ator x) {
        mView.displayID(x);
    }

    @Override
    public void OnFilmesSuccess(Cast x) {
        mView.displayFilmes(x);
    }
}
