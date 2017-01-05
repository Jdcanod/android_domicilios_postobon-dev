package com.postobonapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.postobonapp.R;


public class CityActivity extends AppCompatActivity {

    Button bt_continue;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        bt_continue = (Button) findViewById(R.id.button_add_personal_inf);
        bt_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CityActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}


