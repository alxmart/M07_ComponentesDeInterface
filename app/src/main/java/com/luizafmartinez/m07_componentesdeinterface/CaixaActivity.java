package com.luizafmartinez.m07_componentesdeinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CaixaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixa);

        Button btnSalvar = findViewById(R.id.btn_salvar);

        btnSalvar.setOnClickListener(v ->
                System.out.println("Botão foi clicado")
        );

    }
}