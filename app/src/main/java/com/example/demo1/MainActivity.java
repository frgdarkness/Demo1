package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnTest1;
    TextView txtTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTest1 = (Button) findViewById(R.id.buttonTest1);
        txtTest1 = (TextView) findViewById(R.id.textView);

        btnTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtTest1.getVisibility()==View.VISIBLE)
                    txtTest1.setVisibility(View.INVISIBLE);
                else
                    txtTest1.setVisibility(View.VISIBLE);
            }
        });
    }
}
