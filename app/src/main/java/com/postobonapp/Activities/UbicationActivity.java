package com.postobonapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.postobonapp.R;


public class UbicationActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_register_direction;
    private EditText _et_direction;
    private EditText _et_complement;
    private RadioGroup _rg_direction_type;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubication);
        bt_register_direction = (Button) findViewById(R.id.button_register_me);
        _et_direction = (EditText)findViewById(R.id.add_address_editText);
        _et_complement = (EditText)findViewById(R.id.additional_info_address_editText);
        _rg_direction_type = (RadioGroup) findViewById(R.id.rg_select_direction_type);
        bt_register_direction.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button_register_me:
                validateFields();
                break;
        }

    }

    private void validateFields() {
        String direction = _et_direction.getText().toString();
        String complement = _et_complement.getText().toString();
        if (direction.length()> 0){
            regiserDirection(direction, complement);
        } else {
            Toast.makeText(this, R.string.empty_direction, Toast.LENGTH_SHORT).show();
        }
    }

    private void regiserDirection(String direction, String complement) {
        if (true){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}




