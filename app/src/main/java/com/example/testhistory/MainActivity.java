package com.example.testhistory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_history;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_history =(Button) findViewById(R.id.buttonHistory);
        button_history.setOnClickListener(v -> {
            openHistoryList();
        });
        getSupportActionBar().hide();

    }

    private void openHistoryList() {
        Intent intent = new Intent(this, HistoryList.class);
        startActivity(intent);
    }
}
