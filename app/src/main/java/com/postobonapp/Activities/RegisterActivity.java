package com.postobonapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.postobonapp.R;

import java.util.regex.Pattern;

/**
 * Created by Juan David Cano Duqu on 16/12/2016.
 */

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_continue;
    private EditText _et_name;
    private EditText _et_lastname;
    private EditText _et_email;
    private EditText _et_password;
    private CheckBox _cb_accept_term_conditions;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bt_continue = (Button) findViewById(R.id.button_add_shipping_address);
        _et_name = (EditText)findViewById(R.id.names_editText);
        _et_lastname = (EditText)findViewById(R.id.last_name_editText);
        _et_email = (EditText)findViewById(R.id.e_mail_editText);
        _et_password = (EditText)findViewById(R.id.pass_editText);
        _cb_accept_term_conditions = (CheckBox)findViewById(R.id.rb_accept_term_condition);
        bt_continue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_add_shipping_address:
                validateFields();
                break;
        }
    }

    private void validateFields() {
        if (_cb_accept_term_conditions.isChecked()){
            String userName = _et_name.getText().toString();
            String lastName = _et_lastname.getText().toString();
            String email = _et_email.getText().toString();
            String password = _et_password.getText().toString();
            String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                    "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            if (userName.length() > 0 & lastName.length() > 0 & email.length() > 0 & password.length() > 0) {
                if (Pattern.compile(EMAIL_PATTERN).matcher(email).matches()) {
                        registerUser(userName,lastName, email, password);
                } else {
                    Toast.makeText(this,  R.string.not_mail_pattern, Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this,  R.string.invalid_fields, Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, R.string.not_accepted_terms, Toast.LENGTH_SHORT).show();
        }

    }

    private void registerUser(String userName, String lastName, String email, String password) {
        if (true){
            Intent intent = new Intent(this, UbicationActivity.class);
            startActivity(intent);
        }
    }
}




