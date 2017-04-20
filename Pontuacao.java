package www.projetotaurus.com.br.quizsarah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pontuacao extends AppCompatActivity {

    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontuacao);

        if(getIntent().getExtras().getString("numeroacertos")!=null){
            score = (TextView)findViewById(R.id.tvpont);
            score.setText("Você acertou "+getIntent().getExtras().getString("numeroacertos")+" de 5 questões");
        }
    }
}
