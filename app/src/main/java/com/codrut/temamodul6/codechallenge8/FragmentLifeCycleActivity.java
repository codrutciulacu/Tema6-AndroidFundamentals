package com.codrut.temamodul6.codechallenge8;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codrut.temamodul6.R;

public class FragmentLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_life_cycle);

        BlankFragment fragment = new BlankFragment();
        createDynamicFragment(fragment);
    }

    private void createDynamicFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.dynamic_frame_layout, fragment);
        transaction.commit();
    }
}
