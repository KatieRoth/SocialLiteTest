package com.example.katie.sociallitetest;


import android.content.Intent;
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

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.my_fragment2, container, false);

        ClickMe = (Button) rootView.findViewById(R.id.triviaButton);
        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TeamTriviaDescription.class);
                startActivity(intent);

            }
        });
        return rootView;


    }

} // This is the end of our MyFragments Class
