package com.codrut.teme.codechallenge7;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codrut.teme.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private String mItemName;
    private TextView mFragmentTextView;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank2, container, false);

        initView(v);


        return v;
    }

    private void initView(View view) {
        mFragmentTextView = view.findViewById(R.id.fragment_text_view_nav_drawer_7);
        setFragmentTitle();
    }

    private void setFragmentTitle(){
        if(mFragmentTextView != null && mItemName != null && !mItemName.isEmpty()){
            mFragmentTextView.setText(mItemName);
        }
    }

    public void setItemName(String name){
        mItemName = name;

    }

}
