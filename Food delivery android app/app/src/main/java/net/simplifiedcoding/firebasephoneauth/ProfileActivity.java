package net.simplifiedcoding.firebasephoneauth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends AppCompatActivity {
String valuea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        valuea = getIntent().getStringExtra("USERID");

        TextView aaa=(TextView) findViewById(R.id.textView);

        aaa.setText("Welcome user   "+valuea);

        findViewById(R.id.buttonLogout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }
        });
    }
    public void click(View view){
        Intent myIntent = new Intent(ProfileActivity.this, Village_selection.class);
        // myIntent.putExtra("key", value); //Optional parameters
        startActivity(myIntent);
    }
}
