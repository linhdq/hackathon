package com.example.mrbom.kid;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mrbom.kid.fragment.HomeFragment;
import com.example.mrbom.kid.fragment.ScreenManager;

public class MainActivity extends AppCompatActivity implements ScreenManager {
    private FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openFragment(new HomeFragment(),true);
//        viewPager=(ViewPager)findViewById(R.id.home_viewPager);
//        pagerAdapter=new MyPageAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(pagerAdapter);
//        viewPager.setCurrentItem(3);
    }


    @Override
    public void openFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.trans_left_in, R.anim.trans_left_out);
        fragmentTransaction.replace(R.id.home_frame, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        if (addToBackStack) {
            fragmentTransaction.addToBackStack(fragment.getClass().getName());
        }
        fragmentTransaction.commit();
    }

//    private class MyPageAdapter extends FragmentPagerAdapter
//    {
//        public MyPageAdapter(FragmentManager fm)
//        {
//            super(fm);
//        }
//        @Override
//        public int getCount()
//        {
//            return 3;
//        }
//        @Override
//        public Fragment getItem(int position)
//        {
//            switch(position)
//            {
//                case 0: {
//                    return HomeFragment.newInstance(0, "hello");
//                }
//                case 1:{
//                    return AlphabetFragment.newInstance(1,"Alphabet");
//                }
//                case 2:{
//                    return AlphabetFragment.newInstance(2,"Alphabet");
//                }
//                default : return null;
//            }
//        }
//    }
}
