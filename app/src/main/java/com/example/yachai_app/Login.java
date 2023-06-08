package com.example.yachai_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText edt_usuario, edt_password;
    CheckBox chb_recordar;
    Button btn_ingreso, btn_registrar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_1);
        edt_usuario =(EditText) findViewById(R.id.edt_usuario);
        edt_password =(EditText) findViewById(R.id.edt_password);
        chb_recordar = (CheckBox) findViewById(R.id.chb_recordar);
        btn_ingreso =(Button) findViewById(R.id.btn_ingreso);
        btn_registrar =(Button) findViewById(R.id.btn_registro);
        btn_ingreso.setOnClickListener(this);
        btn_registrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ingreso:
                // Implementar con base de datos
                String user = "admin",pass="admin";
                if (edt_usuario.getText()!=null && edt_password.getText()!=null){
                    if (edt_usuario.getText().toString().equals(user) && edt_password.getText().toString().equals(pass)){
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                    }}
                break;

            case R.id.btn_registro:
                Intent intent= new Intent(Login.this, Register.class);
                startActivity(intent);
                break;
        }
    }
}
