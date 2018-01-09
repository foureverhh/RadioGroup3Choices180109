package com.nackademin.foureverhh.radiogroup3choices180109;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View v)
    {
        TextView txv =(TextView)findViewById(R.id.txv);
        RadioGroup ticketType =(RadioGroup)findViewById(R.id.ticketType);
        RadioGroup ticketAmount =(RadioGroup)findViewById(R.id.ticketAmount);
        /*
        switch (ticketType.getCheckedRadioButtonId())
        {
            case R.id.adult:
                txv.setText("Full ticket.");
                break;
            case R.id.child:
                txv.setText("Child ticket");
                break;
            case R.id.elder:
                txv.setText("Elder ticket");
                break;
        }
        */
        int amount = ticketAmount.getCheckedRadioButtonId();
        RadioButton selectedAmount = (RadioButton)findViewById(amount);
        int id=ticketType.getCheckedRadioButtonId();
        RadioButton select =(RadioButton)findViewById(id);
        txv.setText("Buy "+select.getText()+" and "+selectedAmount.getText());
    }
}
