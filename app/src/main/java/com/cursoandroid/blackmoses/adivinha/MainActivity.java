package com.cursoandroid.blackmoses.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaoJogarId); //o metodo referencia o id botaoJogarId, fazendo cast
        textoResultado = (TextView) findViewById(R.id.resultadoId); // localizar um incone na tela

       // textoResultado.setText("Texto Alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random(); //instanciando uma classe que gera numeros randomicos

                int numeroAleatorio = randomico.nextInt(11);

                textoResultado.setText("Número Escolhido: " + numeroAleatorio);


            }
        });


    }
}
