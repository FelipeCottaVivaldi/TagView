package exercise.tagview.tagviewexercise;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by Felipe on 08/10/2015.
 */
public class ListarFilmesActivity extends AppCompatActivity implements SuccessView {

    public static Integer id;
    public final static String EXTRA_ID = "EXTRA_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_filmes);
        getExtras();
        new Presenter(this, this).loadFilmesAtor(id);
    }

    public void getExtras() {
        Bundle extras = getIntent().getExtras();;
        id = extras.getInt(EXTRA_ID);
    }

    @Override
    public void displayID(Ator ator) {

    }

    @Override
    public void displayFilmes(Cast filmes) {
        //listarFilmes no listView - NAO CONSEGUI FAZER A TEMPO
    }

}
