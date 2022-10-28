package com.example.zerimar_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SingUpCompletedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sing_up_completed);

        TextView goToSingInActivity = findViewById(R.id.goToSingInActivity);
        goToSingInActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingUpCompletedActivity.this, SingInActivity.class);
                startActivity(intent);
            }
        });
    }
}