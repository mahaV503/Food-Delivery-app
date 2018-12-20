package net.simplifiedcoding.firebasephoneauth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

public class sherief extends AppCompatActivity {
public int Swings,Sbiryani,Scury;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sherief);
        NumberPicker np = findViewById(R.id.numPickerBiryani);


        np.setMinValue(1);
        np.setMaxValue(15);
        np.setOnValueChangedListener(onValueChangeListener);
        NumberPicker npw = findViewById(R.id.numPickerwings);


        npw.setMinValue(1);
        npw.setMaxValue(15);
        npw.setOnValueChangedListener(onValueChangewingListener);

        NumberPicker npc = findViewById(R.id.numPickercurry);


        npc.setMinValue(1);
        npc.setMaxValue(15);
        npc.setOnValueChangedListener(onValueChangecurryListener);


    }
    public void deliveryoptions(View view){
        Intent intent=new Intent(sherief.this,delivery.class);
        startActivity(intent);
    }

    NumberPicker.OnValueChangeListener onValueChangeListener =
            new 	NumberPicker.OnValueChangeListener(){
                @Override
                public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                    TextView aaa=(TextView) findViewById(R.id.BiryaniPrice);
                    Sbiryani=numberPicker.getValue();
                    aaa.setText("The Price is "+numberPicker.getValue()*120);
                }
            };
    NumberPicker.OnValueChangeListener onValueChangewingListener =
            new 	NumberPicker.OnValueChangeListener(){
                @Override
                public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                    TextView aaaL=(TextView) findViewById(R.id.LegPieces);
                    Swings=numberPicker.getValue();
                    aaaL.setText("The Price is "+numberPicker.getValue()*50);
                }
            };
    NumberPicker.OnValueChangeListener onValueChangecurryListener =
            new 	NumberPicker.OnValueChangeListener(){
                @Override
                public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                    TextView aaaW=(TextView) findViewById(R.id.Curryprice);
                    Scury=numberPicker.getValue();

                    aaaW.setText("The Price is "+numberPicker.getValue()*80);
                }
            };
    public void openbill(View view){
        Intent intent=new Intent(this,Bill.class);
        //intent.putExtra("bir", Sbiryani);
        //intent.putExtra("win", Swings);
        //intent.putExtra("curry", Scury);
        startActivity(intent);
    }
    public void save(View view){
        Intent intentB=new Intent(this,Bill.class);
        intentB.putExtra("bir", Sbiryani);
        intentB.putExtra("win", Swings);
        intentB.putExtra("curry", Scury);
        Intent intent=new Intent(this,nutakki.class);
        startActivity(intent);
    }
}
