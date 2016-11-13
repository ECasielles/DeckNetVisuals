package com.mercacortex.decknetvisuals.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.mercacortex.decknetvisuals.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin, btnSignup;
    private EditText edtPassword, edtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSignUp);

        btnSignup.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
            view.getContext().startActivity(intent);
        });

        //TODO: Main screen intents and User validation

    }
}
