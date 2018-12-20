package net.simplifiedcoding.firebasephoneauth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class nutakki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutakki);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.sheriefRad:
                if (checked) {
                    buttondispa(1);
                }
                break;
            case R.id.nagRadio:
                if (checked) {
                    buttondispa(2);
                }

                break;
            case R.id.bisRadio:
                if (checked) {
                    buttondispa(3);
                }
                //Toast.makeText(getApplicationContext(),"You are proceeding with BISMILLAH",Toast.LENGTH_LONG).show();
                //buttondisp(3);
                break;
            case R.id.chineseRadio:
                if (checked) {
                    buttondispa(4);
                }
                //Toast.makeText(getApplicationContext(),"You are proceeding with RASOOL",Toast.LENGTH_LONG).show();
                // buttondisp(1);
                break;
            case R.id.curRadio:
                if (checked) {
                    buttondispa(5);
                }
                //Toast.makeText(getApplicationContext(),"You are proceeding with RASOOL",Toast.LENGTH_LONG).show();
                // buttondisp(1);
                break;
            case R.id.rasRadio:
                if (checked) {
                    buttondispa(6);
                    //Toast.makeText(getApplicationContext(),"You are proceeding with RASOOL",Toast.LENGTH_LONG).show();
                    // buttondisp(1);
                    break;

                }
        }

    }
    public void buttondispa(int a){
        if (a==1) {
            Toast.makeText(getApplicationContext(),"SORRY VADDESWARAM ISN't AVAILABLE RIGHT NOW",Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(nutakki.this, sherief.class);
            // myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent);
        }
        if (a==2) {
            Intent myIntent = new Intent(nutakki.this, revendrapadu.class);
            Toast.makeText(getApplicationContext(),"SORRY REVENDRAPADU ISN't AVAILABLE RIGHT NOW",Toast.LENGTH_LONG).show();
            startActivity(myIntent);
        }
        if (a==3) {
            Intent myIntent = new Intent(nutakki.this, nutakki.class);
            // myIntent.putExtra("key", value); //Optional parameters
            startActivity(myIntent);
        }

    }
}
