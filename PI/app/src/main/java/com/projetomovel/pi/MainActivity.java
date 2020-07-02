package com.projetomovel.pi;
import com.projetomovel.pi.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.projetomovel.pi.activitys.TelaCadastro;
import com.projetomovel.pi.activitys.TelaEscola;
import com.projetomovel.pi.activitys.TelaResponsavel;
import com.projetomovel.pi.model.Login;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText textInputEditTextCPF;
    private TextInputEditText textInputEditTextSENHA;
    private Button buttonEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputEditTextCPF = findViewById(R.id.TextInputCPF);
        textInputEditTextSENHA = findViewById(R.id.TextInputSenha);
        buttonEntrar = findViewById(R.id.buttonEntrar);

        buttonEntrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                new Login(textInputEditTextCPF.getText().toString(), textInputEditTextSENHA.getText().toString());

                Class classeResponsalvel = TelaCadastro.class;

                /*
                if (editCPF.getText().toString().isEmpty() && editSenha.getText().toString().isEmpty()) {
                    classeResponsalvel = TelaEscola.class;
                } else if (editCPF.getText().toString() != null && editSenha.getText().toString() != null) {
                    classeResponsalvel = TelaCadastro.class;
                } else if (editCPF.getText().toString().isEmpty() || editSenha.getText().toString().isEmpty()) {
                    classeResponsalvel = TelaResponsavel.class;
                }*/


                Intent intent = new Intent(getApplicationContext(), TelaEscola.class);
                //Passar dados
                startActivity(intent);
            }
        });


    }
}