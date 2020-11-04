package com.example.foodapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.btlogin);
        register=findViewById(R.id.btreg);
    }

    public void Login(View view) {
        Toast.makeText(this, "Login clicked", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,loginActivity.class);
        startActivity(intent);
    }

    public void Account(View view) {
        Toast.makeText(this, "Register clicked", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,SignupActivity.class);
        startActivity(intent);
    }
}
