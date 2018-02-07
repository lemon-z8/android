package com.lemon.z8;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import com.lemon.analysis.AnalysisActivity;
import com.lemon.system.SystemActivity;

import java.util.HashMap;
import java.util.Map;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    Map<Integer,Fragment> fragmentMap;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentMap = new HashMap<Integer, Fragment>();
        fragmentMap.put(MainActivity.ONE, new AnalysisActivity());
        fragmentMap.put(MainActivity.TOW, new SystemActivity());
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentMap.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }


    @Override
    public int getCount() {
        return fragmentMap.size();
    }
}
