package com.example.ex0610;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Switch sw ;
    private ToggleButton tb;
    private Button btn;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = findViewById(R.id.mySwitch);
        tb = findViewById(R.id.myToggleButton);
        btn = findViewById(R.id.btnClick);
        layout = findViewById(R.id.mainLayout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!sw.isChecked() && !tb.isChecked()) {
                    layout.setBackgroundColor(Color.BLUE);
                }
                else if (!sw.isChecked() && tb.isChecked()) {
                    layout.setBackgroundColor(Color.CYAN);
                }
                else if (sw.isChecked() && !tb.isChecked()) {
                    layout.setBackgroundColor(Color.GREEN);
                }
                else if (sw.isChecked() && tb.isChecked()) {
                    layout.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}