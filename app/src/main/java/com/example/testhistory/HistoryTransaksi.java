package com.example.testhistory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HistoryTransaksi extends AppCompatActivity {

    private Button button_back;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.history_list);

        getSupportActionBar().setTitle("History");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener((View v) -> {
            openSettingBack();
        });
        getSupportActionBar().hide();

    }

    private void openSettingBack() {
        startActivity(new Intent(HistoryTransaksi.this, MainActivity.class));
        finish();
    }
}
