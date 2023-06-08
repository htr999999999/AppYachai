package com.example.yachai_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity implements View.OnClickListener {
    EditText edt_reg_nomape,edt_reg_user, edt_reg_email, edt_reg_password1,edt_reg_password2;
    Button btn_reg_registro;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_1);
        edt_reg_nomape = (EditText) findViewById(R.id.edt_reg_nomape);
        edt_reg_email = (EditText) findViewById(R.id.edt_reg_email);
        edt_reg_user= (EditText) findViewById(R.id.edt_reg_user);
        edt_reg_password1= (EditText) findViewById(R.id.edt_reg_password1);
        edt_reg_password2= (EditText) findViewById(R.id.edt_reg_password2);
        btn_reg_registro = (Button) findViewById(R.id.btn_reg_registro);
        btn_reg_registro.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        //Importar info a DB
        Intent intent = new Intent(Register.this, Login.class);
        startActivity(intent);
    }
}
