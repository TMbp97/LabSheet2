package com.lab2.labsheet2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.lab2.labsheet2.MainActivity.*;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message =intent.getStringExtra(EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);


    }
}
