package com.example.homewassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String BONUS_TEXT1 = "com.example.application.homewassignment.BONUS_TEXT1";
    public static final String BONUS_TEXT2 = "com.example.application.homewassignment.BONUS_TEXT2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2page();
            }
        });

//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openMainActivity2page();
//            }
//        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.quit:
                finishAndRemoveTask();
                finish();
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openMainActivity2page() {

        EditText editText1 = (EditText) findViewById(R.id.edittextone);
        String string1 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.edittextwo);
        String string2 = editText1.getText().toString();

        Intent intent;
        intent = new Intent(this, Main2Activity.class);
        intent.putExtra(BONUS_TEXT1, string1);
        intent.putExtra(BONUS_TEXT2, string2);
        startActivity(intent);
    }
}

    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu, menu);
//
//        return true;
//
//        @Override
//        public boolean onOptionsItemSelected (@NonNull MenuItem item){
//            switch (item.getItemId()) {
//                case R.id.quit:
//                    finishAndRemoveTask();
//                    return true;
//                default:
//                    return super.onOptionsItemSelected(item);
//            }
//        }
//    }
//
//}


