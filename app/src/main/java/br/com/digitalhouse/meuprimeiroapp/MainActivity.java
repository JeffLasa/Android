package br.com.digitalhouse.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoApertado(View view) {

        EditText respostaAltura = findViewById(R.id.resposta_altura_id);

        EditText respostaPeso = findViewById(R.id.texto_resposta__peso_id);

        Float altura = Float.parseFloat(respostaAltura.getText().toString());
        Float peso = Float.parseFloat(respostaPeso.getText().toString());
        Float calculo = peso/(altura*altura);
        TextView resposta = findViewById(R.id.resposta_calculo_imc_id);
        resposta.setText("O seu IMC é "+calculo);

        Log.i(MainActivity.class.toString(),"O botão foiapertado");

        Toast.makeText(this,"eu",INPUT_METHOD_SERVICE);
        


    }

}
