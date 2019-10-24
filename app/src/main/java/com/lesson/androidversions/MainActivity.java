package com.lesson.androidversions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    String[] androidNames, androidVersions, apiLevels, releaseDates;
    ListView list;
    int[] cLogo = {R.drawable.cupcake, R.drawable.donut , R.drawable.eclair , R.drawable.froyo , R.drawable.gingerbread , R.drawable.honeycomb , R.drawable.icecreamsandwich , R.drawable.jellybean , R.drawable.kitkat , R.drawable.lollipop , R.drawable.marshmallow , R.drawable.nougat , R.drawable.oreo , R.drawable.pie};

    ArrayList<AndroidInfo> androidList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidNames = getResources().getStringArray(R.array.androidName);
        androidVersions = getResources().getStringArray(R.array.androidVersion);
        apiLevels = getResources().getStringArray(R.array.apiLevel);
        releaseDates = getResources().getStringArray(R.array.releaseDate);
        for(int i=0; i<androidNames.length; i++)
        {
            androidList.add(new AndroidInfo(cLogo[i], androidNames[i], androidVersions[i], apiLevels[i], releaseDates[i]));
        }

        list = findViewById(R.id.lbAndroidInfo);
        AndroidInfoAdapater adapter = new AndroidInfoAdapater(this, R.layout.lbandroidinfo, androidList);
        list.setAdapter(adapter);
        //list.setOnClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {

    }
}
