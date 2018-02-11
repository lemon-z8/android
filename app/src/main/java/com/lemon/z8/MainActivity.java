package com.lemon.z8;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener{
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
    private RadioGroup rg_tab_bar;
    private RadioButton home;
    private RadioButton business;
    private RadioButton analysis;
    private RadioButton system;
    private ViewPager vpager;

    private MyFragmentPagerAdapter mAdapter;

    final static int ONE = 0;
    final static int TOW = 1;
    final static int THREE = 2;
    final static int YOUR = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindViews();
        home.setChecked(true);
    }

    private void bindViews() {
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        home = (RadioButton) findViewById(R.id.home);
        business = (RadioButton) findViewById(R.id.business);
        analysis = (RadioButton) findViewById(R.id.analysis);
        system = (RadioButton) findViewById(R.id.system);
        rg_tab_bar.setOnCheckedChangeListener(this);
        vpager = (ViewPager) findViewById(R.id.vpager);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
        vpager.addOnPageChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.home:
                vpager.setCurrentItem(ONE);
                break;
            case R.id.business:
                vpager.setCurrentItem(TOW);
                break;
            case R.id.analysis:
                vpager.setCurrentItem(THREE);
                break;
            case R.id.system:
                vpager.setCurrentItem(YOUR);
                break;
        }
    }


    //重写ViewPager页面切换的处理方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case ONE:
                    home.setChecked(true);
                    break;
                case TOW:
                    business.setChecked(true);
                    break;
                case THREE:
                    analysis.setChecked(true);
                    break;
                case YOUR:
                    system.setChecked(true);
                    break;
            }
        }
    }

}
