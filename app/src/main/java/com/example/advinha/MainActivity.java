package com.example.advinha;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // função que cria um numero aleatorio de 1 a 100
    int resultado;
    static int GerarNumero(int maximo, int minimo){
        return (int) (Math.random() * (maximo - minimo) + minimo);
    }

    //criando um toast que vai dizer o status da resposta do usuario

    public void GeraToast(String str){
        Toast.makeText(MainActivity.this, str,Toast.LENGTH_SHORT)
                .show();
    }

    //fazendo o click
    public void clicar(View view){

        int resposta_jogador;

        // buscando o edittext
        EditText valor = (EditText) findViewById(R.id.escrevenumero);

        //convertendo para inteiro a string com a resposta
        resposta_jogador = Integer.parseInt(valor.getText().toString());

        int contador;
        if (resposta_jogador < resultado){

            GeraToast("Tente um número maior! Advinhe novamente");


        }
        else if (resposta_jogador > resultado){
            GeraToast("Tente um numero menor! Advinhe novamente");

        }

        else {
            GeraToast("Parabens, tu advinhou o número que eu pensei!");

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int minimo = 0;
        int maximo = 100;
        resultado = GerarNumero(minimo, maximo);






    }
}