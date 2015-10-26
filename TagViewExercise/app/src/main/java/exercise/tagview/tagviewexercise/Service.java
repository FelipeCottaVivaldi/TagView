package exercise.tagview.tagviewexercise;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Felipe on 08/10/2015.
 */
public interface Service {

    @GET("/3/search/person?api_key=bd697ae8d30cbe1c483edd2ca80ed835")
    void getID(
            @Query("query") String ator,
            Callback<Ator> callback);

    @GET("/3/person/{ID_DO_ATOR}/credits?api_key=bd697ae8d30cbe1c483edd2ca80ed835")
    void getFilmes(
            @Path("ID_DO_ATOR") Integer id,
            Callback<Cast> callback);
}
