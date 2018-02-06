package com.lemon.modulea;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.lemon.modulea.fragment.BlankFragment;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_a_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
