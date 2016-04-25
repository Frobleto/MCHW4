package com.example.luis.homework4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class buildings extends AppCompatActivity implements OnItemSelectedListener{
    private WebView webView;

    @Override
    protected void onCreate (Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.buildings_screen);


        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        //Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner drop down elements
        List<String> catagories = new ArrayList<String>();
        catagories.add ("Tower/Main Building");
        catagories.add ("SAC");
        catagories.add ("Jester");
        catagories.add ("PCL");
        catagories.add ("SSB");
        catagories.add ("Union");


        // creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, catagories);

        // Drop down layout
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected (AdapterView<?> parent, View view, int position, long id){
        // on selecting spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show ();

    }
    public void onNothingSelected(AdapterView<?> arg0){
        // TODO Auto generated method sub
    }
}
