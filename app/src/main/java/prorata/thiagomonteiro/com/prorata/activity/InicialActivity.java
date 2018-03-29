package prorata.thiagomonteiro.com.prorata.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import prorata.thiagomonteiro.com.prorata.R;

public class InicialActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textoDescricao;
    private Button botaoComecar;
    private TextView textoSignificado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        imageView = (ImageView) findViewById(R.id.imageView);
        textoDescricao = (TextView) findViewById(R.id.textoDescricaoId);
        botaoComecar = (Button) findViewById(R.id.buttonComecar);
        textoSignificado = (TextView) findViewById(R.id.textoSignificadoId);

        //evento onclick no botão vamos começar (ir para a main activity)
        botaoComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InicialActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
