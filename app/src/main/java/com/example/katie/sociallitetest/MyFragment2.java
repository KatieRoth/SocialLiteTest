package com.example.katie.sociallitetest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Katie on 9/18/2015.
 */

public class MyFragment2 extends Fragment {


    public static MyFragment2 newInstance() {
        MyFragment2 fragment = new MyFragment2();
        return fragment;
    }


    public MyFragment2() {
    }


    Button ClickMe;
    TextView tv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.my_fragment2, container, false);

        ClickMe = (Button) rootView.findViewById(R.id.button2);
        tv = (TextView) rootView.findViewById(R.id.textView3);

        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv.getText().toString().contains("Hello")){
                    tv.setText("Hi");
                }else tv.setText("Hello");
            }
        });

        return rootView;
    }
} // This is the end of our MyFragments Class
