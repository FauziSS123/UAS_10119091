package com.example.uas_10119091;

// nama  : muhammad rojabi nur fauzi
// nim   : 10119091
// kelas : if-3

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button button = findViewById(R.id.btnlogin);
        button.setOnClickListener(this);

        Button btndaftar = findViewById(R.id.btndaftar);
        btndaftar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:
                Intent pindahIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(pindahIntent);
                break;
        }

        switch (v.getId()){
            case R.id.btndaftar:
                Intent pindahIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(pindahIntent);
                break;
        }
    }
}