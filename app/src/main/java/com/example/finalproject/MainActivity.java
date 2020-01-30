package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.finalproject.Adapters.ViewPagerAdapter;
import com.example.finalproject.Fragments.Events;
import com.example.finalproject.Fragments.Promotion;
import com.example.finalproject.Fragments.VideoTime;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout_id);
        viewPager= (ViewPager) findViewById(R.id.view_pager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Adding Fregments
        adapter.AddFragments(new VideoTime(),"VideoTime");
        adapter.AddFragments(new Promotion(), "Promotion");
        adapter.AddFragments(new Events(), "Event");
        //Adapter Setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
