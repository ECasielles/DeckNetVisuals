package com.mercacortex.decknetvisuals.activities;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.mercacortex.decknetvisuals.R;
import com.mercacortex.decknetvisuals.interfaces.ITypeface;
import com.mercacortex.decknetvisuals.interfaces.IValidate;

public class SignupActivity extends AppCompatActivity implements IValidate, ITypeface {

    private final String DEFAULT_COUNTRY = "Spain";

    private Spinner spnCountry;
    private Button btnSignup;
    private RadioGroup rgpGender;
    private CheckBox chbTaC;
    private EditText edtPassword;
    private EditText edtUser;

    private String selectedCountry = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ITypeface.MyTypeface. setActivityTypeface(
                (ViewGroup) findViewById(R.id.activity_signup),
                getAssets()
        );

        spnCountry = (Spinner) findViewById(R.id.spnCountry);
        rgpGender = (RadioGroup) findViewById(R.id.rgpGender);
        chbTaC = (CheckBox) findViewById(R.id.chbTaC);
        btnSignup = (Button) findViewById(R.id.btnSignupOk);
        edtUser = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtUserPassword);


        btnSignup.setVisibility(View.GONE);

        // Signup button is hidden unless Terms are accepted
        chbTaC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked)
                    btnSignup.setVisibility(View.GONE);
                else
                    btnSignup.setVisibility(View.VISIBLE);
            }
        });


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInputString = edtUser.getText().toString();
                String passwordInputString = edtPassword.getText().toString();
                int userValidateCode = UserPwd.validateCredentialsUser(userInputString);
                int pwdValidateCode = UserPwd.validateCredentialsPassword(passwordInputString);

                if(userValidateCode == IValidate.OK) {
                    if (pwdValidateCode == IValidate.OK) {
                        //TODO: Save user and return to Login or return error message
                    }
                }
            }
        });

        loadSpinnerCountry();
    }

    private void loadSpinnerCountry() {

        //TODO: Set Typeface for Spinner
        /*String[] countries = getResources().getStringArray(R.array.countries);
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this,
                R.layout.activity_signup,countries) {

            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                MyTypeface.setViewTypeface(view, getAssets());
                return view;
            }

            public View getDropDownView(int position,  View convertView,  ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                MyTypeface.setViewTypeface(view, getAssets());
                return view;
            }
        };
        */

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.countries, android.R.layout.simple_spinner_dropdown_item);
        spnCountry.setAdapter(adapter);

        spnCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedCountry = adapter.getItem((int) id).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    //TODO: Fields validation for Signup onClick

}
