package com.lemon.business;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.lemon.business.fragment.BlankFragment;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
