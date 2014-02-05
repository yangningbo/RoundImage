package com.androidcasts.RoundImage;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext()).build();
        ImageLoader.getInstance().init(config);

        DisplayImageOptions options = new DisplayImageOptions.Builder()
            .displayer(new RoundBitmapDisplayer())
            .build();
        ImageLoader.getInstance().displayImage("drawable://" + R.drawable.ic_rihanna, imageView, options);
    }
}
