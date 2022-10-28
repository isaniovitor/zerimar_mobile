package com.example.zerimar_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sing_up);

        ConstraintLayout photographerData = findViewById(R.id.photographerData);
        photographerData.setVisibility(View.GONE);

        TextView signUpAsPhotographer = findViewById(R.id.signUpAsPhotographer);
        signUpAsPhotographer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photographerData.setVisibility(View.VISIBLE);
            }
        });

        Button singUpButton = findViewById(R.id.singUpButton);
        singUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingUpActivity.this, SingUpCompletedActivity.class);
                startActivity(intent);            }
        });
    }
}