package net.simplifiedcoding.firebasephoneauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class delivery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int h=dm.heightPixels;int w=dm.widthPixels;
        getWindow().setLayout((int)(h*0.75),(int)(0.7*w));
    }
}
