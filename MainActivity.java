package www.projetotaurus.com.br.quizsarah;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Integer acertos;

    RadioButton b1;
    RadioButton b2;
    RadioButton b3;
    RadioButton b4;
    RadioButton b5;

    Button      enviaresp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acertos = 0;

        enviaresp = (Button)findViewById(R.id.responder);

        b1 = (RadioButton)findViewById(R.id.rb1);
        b2 = (RadioButton)findViewById(R.id.rb2);
        b3 = (RadioButton)findViewById(R.id.rb3);
        b4 = (RadioButton)findViewById(R.id.rb4);
        b5 = (RadioButton)findViewById(R.id.rb5);

        enviaresp.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.responder:
                if(b1.isChecked()){
                    acertos++;
                }
                if(b2.isChecked()){
                    acertos++;
                }
                if(b3.isChecked()){
                    acertos++;
                }
                if(b4.isChecked()){
                    acertos++;
                }
                if(b5.isChecked()){
                    acertos++;
                }

                Bundle extras = new Bundle();
                extras.putString("numeroacertos", acertos.toString());
                Intent score = new Intent(this,Pontuacao.class);
                score.putExtras(extras);
                startActivity(score);

                break;
        }
    }
}
