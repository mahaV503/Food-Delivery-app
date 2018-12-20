package net.simplifiedcoding.firebasephoneauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Bill extends AppCompatActivity {
String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("bir");
            //The key argument here must match that used in the other activity
        }
        TextView aaaW=(TextView) findViewById(R.id.Bquant);


        aaaW.setText(value);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);
        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();

    }

}
