package com.thedeveloperworldisyours.supportingdifferentlanguages;

import android.os.Bundle;
import android.widget.ImageView;
import android.app.Activity;

public class TheDeveloperWorldIsYours extends Activity {

	private ImageView imagenBackground;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_developer_world_is_yours);
        imagenBackground = (ImageView) findViewById(R.id.imageView1);
        
        imagenBackground.setImageDrawable(getResources().getDrawable(R.drawable.background));
    }

}
