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

import java.util.ArrayList;
import java.util.List;


public class Fragment01 extends Fragment implements ViewPager.OnPageChangeListener,View.OnClickListener{

    private List<Fragment> list;
    private View view;
    private ViewPager viewPager;
    private Button button01,button02,button03,button04;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_fragment01,container,false);
        initView();
        return view;
    }


    private void initView() {
        viewPager=(ViewPager)view.findViewById(R.id.viewpager01);

        list=new ArrayList<>();
        button01=(Button)view.findViewById(R.id.frag01);
        button02=(Button)view.findViewById(R.id.frag02);
        button03=(Button)view.findViewById(R.id.frag03);
        button04=(Button)view.findViewById(R.id.frag04);

        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
        button03.setOnClickListener(this);
        button04.setOnClickListener(this);

        //这些界面要也要一个一个先去实现
        list.add(new Frag01());
        list.add(new Frag02());
        list.add(new Frag03());
        list.add(new Frag04());

        viewPager.setAdapter(new FragmentAdapter(getFragmentManager(),list));
        viewPager.setOnPageChangeListener(this);
        viewPager.setCurrentItem(0);

    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        initBtnListener();
        switch (i){
            case 0:
                button01.setBackgroundColor(Color.parseColor("#ff735c"));
                break;
            case 1:
                button02.setBackgroundColor(Color.parseColor("#ff735c"));
                break;
            case 2:
                button03.setBackgroundColor(Color.parseColor("#ff735c"));
                break;
            case 3:
                button04.setBackgroundColor(Color.parseColor("#ff735c"));
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    @Override
    public void onClick(View v) {
        initBtnListener();
        switch (v.getId()){
            case R.id.frag01:
                button01.setBackgroundResource(R.color.colorbai);
                //button01.setBackgroundColor(Color.parseColor("#ff735c"));
                viewPager.setCurrentItem(0);
                break;
            case R.id.frag02:
                button01.setBackgroundResource(R.color.colorbai);
               // button02.setBackgroundColor(Color.parseColor("#ff735c"));
                viewPager.setCurrentItem(1);
                break;
            case R.id.frag03:
                button01.setBackgroundResource(R.color.colorbai);
               // button03.setBackgroundColor(Color.parseColor("#ff735c"));
                viewPager.setCurrentItem(2);
                break;
            case R.id.frag04:
                button01.setBackgroundResource(R.color.colorbai);
               // button04.setBackgroundColor(Color.parseColor("#ff735c"));
                viewPager.setCurrentItem(3);
                break;
        }
    }

    private void initBtnListener(){

        button01.setBackgroundResource(R.color.colorbai);
        button02.setBackgroundResource(R.color.colorbai);
        button03.setBackgroundResource(R.color.colorbai);
        button04.setBackgroundResource(R.color.colorbai);
    }
}

/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment01.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment01#newInstance} factory method to
 * create an instance of this fragment.

/*public class Fragment01 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters


    // TODO: Rename and change types and number of parameters
    public static Fragment01 newInstance(String param1, String param2) {
        Fragment01 fragment = new Fragment01();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment01, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

   public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
*/
