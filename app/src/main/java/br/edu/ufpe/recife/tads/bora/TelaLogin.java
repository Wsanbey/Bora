package br.edu.ufpe.recife.tads.bora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
    }

    public void gotoTelaCadastro(View view) {
        Intent intent = new Intent(this, TelaCadastro.class);
        startActivity(intent);

    }

    public void gotoTelaInicial(View view) {
        Intent intent = new Intent (this, TelaInicial.class);
        startActivity(intent);
    }
}