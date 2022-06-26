package br.edu.ufpe.recife.tads.bora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lista_Motorista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_motorista);

    }
    public void voltarCasa(View view){

        Intent intent = new Intent(getApplicationContext(), ModoPegarOuDarCarona.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void informacaoMotorista(View view){

        Intent intent = new Intent(getApplicationContext(), DadosMotorista.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void dadosMotorista(View view){

        Intent intent = new Intent(getApplicationContext(), DadosMotorista.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}