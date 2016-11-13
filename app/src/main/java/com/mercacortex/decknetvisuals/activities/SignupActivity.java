package com.mercacortex.decknetvisuals.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.mercacortex.decknetvisuals.R;

public class SignupActivity extends AppCompatActivity {

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

        spnCountry = (Spinner) findViewById(R.id.spnCountry);
        rgpGender = (RadioGroup) findViewById(R.id.rgpGender);
        chbTaC = (CheckBox) findViewById(R.id.chbTaC);

        // Signup button is hidden unless Terms are accepted
        chbTaC.setOnCheckedChangeListener((btnSignup, isChecked)
                -> btnSignup.setVisibility(isChecked ? View.VISIBLE : View.GONE));

        loadSpinnerCountry();
    }

    private void loadSpinnerCountry() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.countries, android.R.layout.simple_spinner_dropdown_item);
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
