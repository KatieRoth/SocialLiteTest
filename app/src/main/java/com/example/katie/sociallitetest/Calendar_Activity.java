package com.example.katie.sociallitetest;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Calendar_Activity extends ListActivity {
    private TextView text;
    private List<String>listValues;
    private Boolean haikuBool = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //Boolean haikuEvent = bundle.getBoolean("haiku");

        text = (TextView) findViewById(R.id.mainText);
        listValues = new ArrayList<String>();
        if(!bundle.isEmpty()) {
            Boolean haikuEvent = bundle.getBoolean("haiku");


            if (haikuEvent == true) {
                haikuBool = true; 

            }
        }
        if (haikuBool == true) {
            listValues.add("Haiku Deathmatch        Fri. 10 pm");
        }
        listValues.add("Team Trivia             Sat. 8 pm");
        listValues.add("French Cooking          Mon. 7 am");
        listValues.add("Salsa Dancing           Tues. 6 pm");
        listValues.add("Adult Acting            Thurs. 9 pm");


        ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(this, R.layout.row_layout,R.id.listText, listValues);
        setListAdapter(myAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calendar_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void sendBackToFragment() {
        Intent intent = new Intent(this, MyFragment.class);
        startActivity(intent);
    }
}
