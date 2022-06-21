package br.edu.ufpe.recife.tads.bora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ModoPegarOuDarCarona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_pegar_ou_dar_carona);
    }

    public void confirmado(View view){

        Intent intent = new Intent(getApplicationContext(), AposSelecaoDaViagem.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    
}