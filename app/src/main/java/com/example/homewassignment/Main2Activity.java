package com.example.homewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

        public void openMainActivity() {

            Intent intentmain;
            intentmain = new Intent(this, MainActivity.class);
            startActivity(intentmain);

            Intent intent =getIntent();
            String string1 = intent.getStringExtra(MainActivity.BONUS_TEXT1);
            String string2 = intent.getStringExtra(MainActivity.BONUS_TEXT2);

            TextView textView1 = (TextView) findViewById(R.id.textview1);
            TextView textView2 = (TextView) findViewById(R.id.textview2);

            textView1.setText(string1);
            textView2.setText(string2);


    }
}
