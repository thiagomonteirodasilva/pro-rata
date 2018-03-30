package prorata.thiagomonteiro.com.prorata.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import prorata.thiagomonteiro.com.prorata.R;

public class MainActivity extends AppCompatActivity {

    private TextView descricaoValor;
    private EditText textoValor;
    private TextView textoNumeroDias;
    private EditText numeroDias;
    private Button botaoCalcular;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        descricaoValor = (TextView) findViewById(R.id.descricaoValorId);
        textoValor = (EditText) findViewById(R.id.editTextValorId);
        textoNumeroDias = (TextView) findViewById(R.id.textoNumeroDiasId);
        numeroDias = (EditText) findViewById(R.id.editTextDiasId);
        botaoCalcular = (Button) findViewById(R.id.buttonCalcular);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);

        //evento de click no botão calcular
        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //para recuperar valores digitados
                String valor = textoValor.getText().toString();
                String diasUsados = numeroDias.getText().toString();

                //lógica para cálculo da pró-rata
                if (!valor.equals("") && !valor.isEmpty() && !diasUsados.equals("") && !diasUsados.isEmpty()){

                    //converte string para double
                    Double valorFatura = Double.parseDouble(valor);
                    Double numeroDiasUsados = Double.parseDouble(diasUsados);

                    //cálculo
                    double resultado = valorFatura / 30 * numeroDiasUsados;

                    //resultado na tela (com duas casas após a vírgula)
                    textoResultado.setText("Total do valor proporcional: \n R$ " + String.format("%.2f", resultado));

                } else{
                    Toast.makeText(MainActivity.this, "Nenhum dos campos podem ficar em branco!", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
