package com.yuibox.HelloAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;
 
public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this, mThumbIds));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
               // Toast.makeText(HelloAndroid.this, "" + position, Toast.LENGTH_SHORT).show();
            	Intent myIntent = new Intent(HelloAndroid.this, NextActivity.class);
            	myIntent.putExtra("Img", mThumbIds[position]);
            	
            	HelloAndroid.this.startActivity(myIntent);
            }
        });
    }	
    // references to our images
    public Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1
    };	    
}

/**  super.onCreate(savedInstanceState);
  setContentView(R.layout.main); /**mail.xml @ Layout folder*/
  
  /**How to get color from resources */
  /** int mainBackGroundColor = activity.getResources.getColor(R.color.main_back_ground_color); */
