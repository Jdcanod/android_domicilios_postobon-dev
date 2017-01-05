package com.postobonapp.Activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.postobonapp.R;
import com.postobonapp.Utils.LocalConstants;

import java.util.regex.Pattern;

/**
 * Created by apple on 12/21/16.
 */

public class LogginActivity extends Activity implements View.OnClickListener{

    private EditText _et_LogUserName;
    private EditText _et_LogPassword;
    private Button _bt_Begin;
    private TextView tvGoToPasswordRecovery;
    private ProgressDialog loader;
    private Toast toast;
    public static SharedPreferences preferencesUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.loggin_activity);
        preferencesUser = this.getSharedPreferences(LocalConstants.SHARED_PREFERENCES, Context.MODE_PRIVATE);
        _et_LogUserName = (EditText) findViewById(R.id.e_mail_editText);
        _et_LogPassword = (EditText) findViewById(R.id.pass_editText);
        tvGoToPasswordRecovery = (TextView)findViewById(R.id.password_forgotten);
        tvGoToPasswordRecovery.setOnClickListener(this);
        _bt_Begin = (Button) findViewById(R.id.button_loggin);
        _bt_Begin.setOnClickListener(this);
        loader = new ProgressDialog(this);
        toast = Toast.makeText(this, "", Toast.LENGTH_LONG);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_loggin:
                validateFields();
                break;
            case R.id.password_forgotten:
                //todo: create intent to password recovery
                break;
        }
    }

    private void validateFields() {
        String LogUserName = _et_LogUserName.getText().toString();
        String LogPassword = _et_LogPassword.getText().toString();
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (LogUserName.length() > 0) {
            if (Pattern.compile(EMAIL_PATTERN).matcher(LogUserName).matches()) {
                if (LogPassword.length() >= 5) {
                    logUser(LogUserName, LogPassword);
                } else {
                    Toast.makeText(this,  R.string.empty_password_error, Toast.LENGTH_SHORT).show();
                }

            } else {
                Toast.makeText(this,  R.string.not_mail_pattern, Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this,  R.string.empty_email, Toast.LENGTH_SHORT).show();
        }
    }

    private void logUser(String logUserName, String logPassword) {
        //todo: create requesttask
    }
}
