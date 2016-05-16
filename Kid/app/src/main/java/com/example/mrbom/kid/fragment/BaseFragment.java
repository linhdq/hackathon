package com.example.mrbom.kid.fragment;

import android.app.Fragment;

/**
 * Created by MrBom on 5/14/2016.
 */
public class BaseFragment extends Fragment {
    public BaseFragment() {
    }
    protected ScreenManager getScreenManager(){
        return (ScreenManager)getActivity();
    }
}
