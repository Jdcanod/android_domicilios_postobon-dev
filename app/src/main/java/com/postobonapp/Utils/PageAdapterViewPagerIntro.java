package com.postobonapp.Utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.postobonapp.Fragments.IntroImageFragment;

/**
 *
 * Created by arodriguez on 23/07/15.
 */
public class PageAdapterViewPagerIntro extends FragmentPagerAdapter {


    public PageAdapterViewPagerIntro(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int pos) {

        switch (pos) {

            case 0:
                return new IntroImageFragment();
            case 1:
                return new IntroImageFragment();
            case 2:
                return new IntroImageFragment();
            case 3:
                return new IntroImageFragment();
            default:
                return new IntroImageFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}