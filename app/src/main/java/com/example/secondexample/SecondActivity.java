package com.example.secondexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast toast=Toast.makeText(this.getApplicationContext(),"Opening",Toast.LENGTH_SHORT);
        toast.show();

        if(getIntent().hasExtra("Key")){
            TextView display= (TextView) findViewById(R.id.textView);
            String text=getIntent().getExtras().getString("Key");
            display.setText(text);
        }
    }
}