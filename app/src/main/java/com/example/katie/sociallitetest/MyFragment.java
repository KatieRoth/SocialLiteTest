package com.example.katie.sociallitetest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Katie on 9/18/2015.
 */

public class MyFragment extends Fragment {


    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();

        return fragment;
    }


    public MyFragment() {
    }


    Button ClickMe;
    TextView tv;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.my_fragment, container, false);

        ClickMe = (Button) rootView.findViewById(R.id.button);

        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HaikuDescription.class);
                startActivity(intent);

            }
        });
        return rootView;


    }

   /*     ClickMe = (Button) rootView.findViewById(R.id.Calendar);
        tv = (TextView) rootView.findViewById(R.id.textView2);
        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              sendToCalendar();

            }
        });

        ClickMe = (Button) rootView.findViewById(R.id.settings);
        tv = (TextView) rootView.findViewById(R.id.textView2);
        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToSettings();

            }
        });

        return rootView;
    }
  /*  private void sendToCalendar() {
        Intent intent = new Intent(getActivity(), Calendar_Activity.class);
        Bundle bundle = new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void sendToSettings() {
        Intent intent = new Intent(getActivity(), PrefereceActivity.class);
        startActivity(intent);
    }
    */

    }// This is the end of our MyFragments Class
