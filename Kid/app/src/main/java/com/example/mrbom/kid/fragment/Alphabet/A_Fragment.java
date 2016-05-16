package com.example.mrbom.kid.fragment.Alphabet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mrbom.kid.R;
import com.example.mrbom.kid.fragment.BaseFragment;

/**
 * Created by MrBom on 5/14/2016.
 */
public class A_Fragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }
}
