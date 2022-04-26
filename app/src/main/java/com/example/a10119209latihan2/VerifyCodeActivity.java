package com.example.a10119209latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//26 April 2022, 10119209, Muhammad Iqbal Rosyidin, IF5
public class VerifyCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);
    }

    public void send (View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
