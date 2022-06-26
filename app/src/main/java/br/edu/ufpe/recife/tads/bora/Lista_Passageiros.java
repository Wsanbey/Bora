package br.edu.ufpe.recife.tads.bora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Lista_Passageiros extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_passageiros);
    }

    public void voltarCasa(View view){
        Intent intent = new Intent(getApplicationContext(), ModoPegarOuDarCarona.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void informacaoPassageiro(View view){
        Intent intent = new Intent(getApplicationContext(), DadosPassageiro.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void dadosMotorista(View view){

        Intent intent = new Intent(getApplicationContext(), DadosMotorista.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }



}