package exercise.tagview.tagviewexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SuccessView {

    public final static String EXTRA_ID = "EXTRA_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text_ator);
        String ator = editText.getText().toString().trim();

        new Presenter(this, this).loadIdAtor(ator);

    }

    @Override
    public void displayID(Ator ator) {
        Integer id = ator.id();
        Intent intent = new Intent(this, ListarFilmesActivity.class);
        intent.putExtra(EXTRA_ID, id);
        startActivity(intent);
    }

    @Override
    public void displayFilmes(Cast filmes) {

    }

}
