package com.mercacortex.decknetvisuals.activities;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mercacortex.decknetvisuals.R;
import com.mercacortex.decknetvisuals.interfaces.ITypeface;
import com.mercacortex.decknetvisuals.interfaces.IValidate;

public class LoginActivity extends AppCompatActivity implements IValidate, ITypeface {

    private Button btnLogin, btnSignup;
    private TextView txvAbout;
    private EditText edtPassword, edtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ITypeface.MyTypeface.setActivityTypeface(
                (ViewGroup) findViewById(R.id.activity_login),
                getAssets()
        );

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSignUp);
        edtUser = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtUserPassword);
        txvAbout = (TextView) findViewById(R.id.txvAbout);

        btnSignup.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
            view.getContext().startActivity(intent);
        });

        txvAbout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
            view.getContext().startActivity(intent);
        });

        //TODO: Main screen intents and User validation

    }

}
