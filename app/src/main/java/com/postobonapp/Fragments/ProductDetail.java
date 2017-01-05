package com.postobonapp.Fragments;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.postobonapp.R;
import com.postobonapp.Utils.PageAdapterViewPagerIntro;

/**
 * Created by Juan David Cano Duqu on 04/01/2017.
 */

public class ProductDetail extends Fragment implements ViewPager.OnPageChangeListener {

    private static Drawable background;
    public RelativeLayout mFragmentContentSpace;
    View mView;
    RadioGroup radioGroup;
    Context mCtx;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.activity_store, container,false);
        radioGroup = (RadioGroup)mView.findViewById(R.id.product_radiogroup);
        ViewPager pager = (ViewPager) mView.findViewById(R.id.viewPager_introduction);
        pager.addOnPageChangeListener(this);
        pager.setAdapter(new PageAdapterViewPagerIntro(getFragmentManager()));
        return mView;
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        mCtx = context;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        switch (position) {
            case 0:
                radioGroup.check(R.id.product_radioButton);
                break;
            case 1:
                radioGroup.check(R.id.product_radioButton2);
                break;
            case 2:
                radioGroup.check(R.id.product_radioButton3);
                break;
            case 3:
                radioGroup.check(R.id.product_radioButton4);
                break;
            case 4:
                radioGroup.check(R.id.product_radioButton5);
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
