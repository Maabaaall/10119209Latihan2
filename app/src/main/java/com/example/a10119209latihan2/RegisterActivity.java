package com.example.a10119209latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

//26 April 2022, 10119209, Muhammad Iqbal Rosyidin, IF5
public class RegisterActivity extends AppCompatActivity {

    private RadioGroup genderGroup;
    private RadioButton gender;
    private Spinner blood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        blood = (Spinner) findViewById(R.id.bloodType);
    }

    public void onClick(View v) {

        // get selected radio button from radioGroup
        int selectedId = genderGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        gender = (RadioButton) findViewById(selectedId);

    }

    public void back (View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void listBlood(View view) {
        Toast.makeText(RegisterActivity.this, "Selected "+ blood.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    };

    public void register(View view){
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }

}
