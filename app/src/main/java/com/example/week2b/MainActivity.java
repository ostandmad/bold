package com.example.week2b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        RadioGroup rg = (RadioGroup) findViewById(R.id.radiogroup);
        String value = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        TextView t1 = (TextView) findViewById(R.id.textView4);
        TextView t3 = (TextView) findViewById(R.id.textView5);
        TextView t2 = (TextView) findViewById(R.id.textView6);
        if (c1.isChecked()) {
            t1.setText("BOLD");
            t1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            if (value.equals("Left"))
                t1.setGravity(Gravity.LEFT);
            else if (value.equals("Right"))
                t1.setGravity(Gravity.RIGHT);
            else t1.setGravity(Gravity.CENTER);
        } else t1.setText("");
        if (c2.isChecked()) {
            t2.setText("ITALIC");
            t2.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
            if (value.equals("Left"))
                t2.setGravity(Gravity.LEFT);
            else if (value.equals("Right"))
                t2.setGravity(Gravity.RIGHT);
            else t2.setGravity(Gravity.CENTER);
        } else t2.setText("");
        if (c3.isChecked()) {
            t3.setText("NORMAL");
            if (value.equals("Left"))
                t3.setGravity(Gravity.LEFT);
            else if (value.equals("Right"))
                t3.setGravity(Gravity.RIGHT);
            else t3.setGravity(Gravity.CENTER);
        } else t3.setText("");
    }
}

