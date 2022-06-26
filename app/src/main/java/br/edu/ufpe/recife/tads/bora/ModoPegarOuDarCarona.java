package br.edu.ufpe.recife.tads.bora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ModoPegarOuDarCarona extends AppCompatActivity {
    int passageiro, motorista ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_pegar_ou_dar_carona);
    }
   // Definindo tipo da viagem a ser feita

    public void vouDePassageiro(View view){
        passageiro = 1;
        CharSequence text = "Você selecionou passageiro";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
        motorista = 0;
    }

    public void vouDeMotorista(View view){
        motorista = 1;
        CharSequence  text = "Você selecionou Motorista";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
        passageiro = 0;
    }

    public void selecionarModoViagem(View view){

        if(passageiro == 1){
            Intent intent = new Intent(getApplicationContext(), Lista_Passageiros.class );
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            motorista = 0;
        }
        else if(motorista == 1 ){
            Intent intent = new Intent(getApplicationContext(), Lista_Motorista.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            passageiro = 0;
        } else{
            Context context = getApplicationContext();
            CharSequence text = "Você tem que selecionar uma opção";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void voltarCasa(View view){
        Intent intent = new Intent(getApplicationContext(), TelaInicial.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    
}