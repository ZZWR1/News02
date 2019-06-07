package com.example.newsjiemian;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class Fragment02 extends Fragment implements ViewPager.OnPageChangeListener,View.OnClickListener{

    private List<Fragment> list;
    private View view;
    private ViewPager viewPager;
    private EditText Et;
    private Button bt02;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment02,container,false);
        //initView();
        return view;
    }


    /*private void initView() {
        viewPager=(ViewPager)view.findViewById(R.id.viewpager01);

        list=new ArrayList<>();
        button01=(Button)view.findViewById(R.id.frag01);
        button01.setOnClickListener(this);

        //这些界面要也要一个一个先去实现
        list.add(new Frag01());

        viewPager.setAdapter(new FragmentAdapter(getFragmentManager(),list));
        viewPager.setOnPageChangeListener(this);
        viewPager.setCurrentItem(0);

    }
*/
    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        initBtnListener();
        switch (i){
            case 0:
                bt02.setBackgroundColor(Color.parseColor("#ff735c"));
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    @Override
    public void onClick(View v) {
        initBtnListener();
      /*  switch (v.getId()){
            case R.id.frag01:
                button01.setBackgroundResource(R.color.colorbai);
                viewPager.setCurrentItem(0);
                break;

        }*/
    }

    private void initBtnListener(){


    }
}

