package com.example.bichitoscontreras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText txtUser;
    EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnLogin);
        txtUser = findViewById(R.id.txtUser);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtUser.getText().toString().equals("bichito")) {
                    Intent o = new Intent(LoginActivity.this,
                            MainActivity.class);
                    startActivity(o);

                }
            }
            } );
    }
}
