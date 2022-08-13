package com.example.uas_10119091;

// nama  : muhammad rojabi nur fauzi
// nim   : 10119091
// kelas : if-3

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.InflateException;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

public class LoginActivity extends Activity implements View.OnClickListener{

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btndaftar = findViewById(R.id.btndaftar);
        btndaftar.setOnClickListener(this);

        Name = (EditText)findViewById(R.id.mail);
        Password = (EditText)findViewById(R.id.password);
        Info = (TextView)findViewById(R.id.forget_pass);
        Login = (Button)findViewById(R.id.button);

        Info.setText("Jumlah kesempatan login hanya: 5 kali");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btndaftar:
                Intent pindahIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(pindahIntent);
                break;
        }
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            counter--;

            Info.setText("Jumlah kesempatan login hanya: " + String.valueOf(counter) + " kali lagi");

            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }


}