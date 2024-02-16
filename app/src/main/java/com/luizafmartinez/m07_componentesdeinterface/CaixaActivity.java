package com.luizafmartinez.m07_componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class CaixaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixa);

        Button btnSalvar = findViewById(R.id.btn_salvar);

        TextInputEditText email = findViewById(R.id.edit_email);

        btnSalvar.setOnClickListener(v -> {

            String emailusuario = email.getText().toString();
            //System.out.println("Botão foi clicado");
            System.out.println("E-mail selecionado: " + emailusuario);
        });

    }
}