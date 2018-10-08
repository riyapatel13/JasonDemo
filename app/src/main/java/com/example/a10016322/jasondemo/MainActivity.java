package com.example.a10016322.jasondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject schoolInfo = new JSONObject();
        try
        {
            schoolInfo.put("name", "Steve"); //comes out in a random order
            schoolInfo.put("grade", 3);
            schoolInfo.put("id", 12345678);
        }catch (JSONException e){}

        Log.d("schoolInfo", schoolInfo.toString());
        /*try {
            Log.d("schoolInfo", schoolInfo.get("name").toString());
        }catch(JSONException e){}*/

        JSONObject compSci = new JSONObject();
        try {
            compSci.put("grade", "A");
            compSci.put("percentage", 96);
            schoolInfo.put("computer science", compSci);

            Log.d("schoolInfo", schoolInfo.toString());

        }catch(JSONException e){}

        JSONObject bio = new JSONObject();
        try{
            bio.put("grade", "B");
            bio.put("percentage", 85);
            schoolInfo.put("biology" ,bio);

            Log.d("schoolInfo", schoolInfo.toString());

        }catch(JSONException e){}

        //print name and percent in bio only using schoolInfo

        try{
            JSONObject savedBio = schoolInfo.getJSONObject("biology");
            int grade = savedBio.getInt("percentage");

            Log.d("schoolInfo", savedBio.get("percentage").toString());

        }catch(JSONException e){}

    }
}
