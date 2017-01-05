package com.postobonapp.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioGroup;

import com.postobonapp.R;
import com.postobonapp.Utils.LocalConstants;
import com.postobonapp.Utils.PageAdapterViewPagerIntro;

/**
 * Created by apple on 12/20/16.
 */

public class IntroductionActivity extends FragmentActivity implements ViewPager.OnPageChangeListener {
    private RadioGroup radioGroup;

    private String TAG;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TAG = this.getLocalClassName();
        preferences = getSharedPreferences(LocalConstants.SHARED_PREFERENCES, Context.MODE_PRIVATE);

        setContentView(R.layout.introduction_activity);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager_introduction);
        pager.addOnPageChangeListener(this);
        pager.setAdapter(new PageAdapterViewPagerIntro(getSupportFragmentManager()));
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                radioGroup.check(R.id.radioButton);
                break;
            case 1:
                radioGroup.check(R.id.radioButton2);
                break;
            case 2:
                radioGroup.check(R.id.radioButton3);
                break;
            case 3:
                radioGroup.check(R.id.radioButton4);
                break;
            case 4:
                radioGroup.check(R.id.radioButton5);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     * Onclick method Button Create Account - Login
     *
     * @param view Button selected
     */
    public void onClickButton(View view) {

        Intent in = new Intent();

        switch (view.getId()) {
            case R.id.btn_new_account:
                in.setClass(this, CityActivity.class);
                this.startActivity(in);
                break;
            case R.id.btn_login:
                in.setClass(this, LogginActivity.class); //To Data Treatment Advise, before Loggin.class
                this.startActivity(in);
                break;
            case R.id.btn_unregister_session:
                break;
        }

    }

}

