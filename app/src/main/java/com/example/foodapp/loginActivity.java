package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    TextView regs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        regs=findViewById(R.id.accountcreate);
    }

    public void Account(View view) {
        Intent intent=new Intent(this,SignupActivity.class);
        startActivity(intent);
    }
}