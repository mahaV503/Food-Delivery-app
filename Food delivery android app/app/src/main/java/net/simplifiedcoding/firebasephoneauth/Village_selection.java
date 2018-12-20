package net.simplifiedcoding.firebasephoneauth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Village_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_village_selection);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.vadRadio:
                if (checked)
                    //Toast.makeText(getApplicationContext(),"You are proceeding with RASOOL",Toast.LENGTH_LONG).show();
                    buttondisp(1);
                break;
            case R.id.revRadio:
                if (checked)
                    //Toast.makeText(getApplicationContext(),"You are proceeding with KARIM",Toast.LENGTH_LONG).show();
                    buttondisp(2);
                break;
            case R.id.nutRadio:
                if (checked)
                    //Toast.makeText(getApplicationContext(),"You are proceeding with BISMILLAH",Toast.LENGTH_LONG).show();
                    buttondisp(3);
                break;

        }
    }
    public void buttondisp(int a){
        if (a==1) {
            Toast.makeText(getApplicationContext(),"SORRY VADDESWARAM ISN't AVAILABLE RIGHT NOW",Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(Village_selection.this, vaddeswaram.class);
            // myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent);
        }
        if (a==2) {
            Intent myIntent = new Intent(Village_selection.this, revendrapadu.class);
            Toast.makeText(getApplicationContext(),"SORRY REVENDRAPADU ISN't AVAILABLE RIGHT NOW",Toast.LENGTH_LONG).show();
            startActivity(myIntent);
        }
        if (a==3) {
            Intent myIntent = new Intent(Village_selection.this, nutakki.class);
            // myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent);
        }

    }
}
