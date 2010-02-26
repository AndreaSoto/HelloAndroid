package com.yuibox.HelloAndroid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class NextActivity extends Activity {

	//Your member variable declaration here
	private ImageView Iv;
	// Called when the activity is first created.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nextactivity);
		
		//get intent string
		Integer sImg = getIntent().getIntExtra("Img", 0);
		//sets texts = Intentstring
		Iv = (ImageView)findViewById(R.id.Img);
		Iv.setImageResource(sImg);
		
		Bitmap m = BitmapFactory.decodeResource(this.getResources(), sImg);
		
	}
}