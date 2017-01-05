package com.postobonapp.Fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.postobonapp.R;

/**
 * Created by apple on 12/20/16.
 */

public class IntroImageFragment extends Fragment {

    private static Drawable background;
    public RelativeLayout mFragmentContentSpace;

    public IntroImageFragment(){

    }
    public static IntroImageFragment newInstance(Drawable image){
        IntroImageFragment intro = new IntroImageFragment();
        background = image;
        return intro;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.introduction_image_fragment, container, false);
        mFragmentContentSpace = (RelativeLayout)view.findViewById(R.id.rl_intro_image);
        if (background != null) {
            mFragmentContentSpace.setBackground(background);
        }
        return view;
    }
}
