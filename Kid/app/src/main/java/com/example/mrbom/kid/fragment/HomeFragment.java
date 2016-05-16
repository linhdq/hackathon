package com.example.mrbom.kid.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import com.example.mrbom.kid.R;
import com.example.mrbom.kid.fragment.Alphabet.A_Fragment;

/**
 * Created by MrBom on 5/14/2016.
 */
public class HomeFragment extends BaseFragment implements View.OnClickListener{
    private ImageButton btnABC;
    private ImageButton btn123;
    private ImageButton btnAnimal;
    private ImageButton btnFlower;
    private ImageButton btnToy;
    private ImageButton btnWriting;
    private Animation animationIn, animationOut;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home,container, false);
        initControl(view);
        return view;
    }
//    public static HomeFragment newInstance(int page, String title) {
//        HomeFragment homeFragment = new HomeFragment();
//        Bundle args = new Bundle();
//        args.putInt("someInt", page);
//        args.putString("someTitle", title);
//        homeFragment.setArguments(args);
//        return homeFragment;
//    }
    private void initControl(View view){
        btnABC=(ImageButton)view.findViewById(R.id.btn_abc);
        btn123=(ImageButton)view.findViewById(R.id.btn_123);
        btnAnimal=(ImageButton)view.findViewById(R.id.btn_animal);
        btnFlower=(ImageButton)view.findViewById(R.id.btn_flower);
        btnToy=(ImageButton)view.findViewById(R.id.btn_toy);
        btnWriting=(ImageButton)view.findViewById(R.id.btn_writing);
        btnABC.setOnClickListener(this);
        btn123.setOnClickListener(this);
        btnAnimal.setOnClickListener(this);
        btnFlower.setOnClickListener(this);
        btnToy.setOnClickListener(this);
        btnWriting.setOnClickListener(this);
        animationIn= AnimationUtils.loadAnimation(view.getContext(),R.anim.zoom_in);
        animationOut= AnimationUtils.loadAnimation(view.getContext(),R.anim.zoom_out);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_abc:{
                animationOut.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        getScreenManager().openFragment(new A_Fragment(),true);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                btnABC.startAnimation(animationIn);
                btnABC.startAnimation(animationOut);

                break;
            }
            case R.id.btn_123:{
                animationOut.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                btn123.startAnimation(animationIn);
                btn123.startAnimation(animationOut);
                break;
            }
            case R.id.btn_animal:{
                animationOut.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                btnAnimal.startAnimation(animationIn);
                btnAnimal.startAnimation(animationOut);
                break;
            }
            case R.id.btn_flower:{
                animationOut.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                btnFlower.startAnimation(animationIn);
                btnFlower.startAnimation(animationOut);
                break;
            }
            case R.id.btn_toy:{
                animationOut.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                btnToy.startAnimation(animationIn);
                btnToy.startAnimation(animationOut);
                break;
            }
            case R.id.btn_writing:{
                animationOut.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                btnWriting.startAnimation(animationIn);
                btnWriting.startAnimation(animationOut);
                break;
            }
            default:break;
        }
    }

}
