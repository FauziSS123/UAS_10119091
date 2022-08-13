package com.example.uas_10119091;

//        nim : 10119091
//        nama : muhammadrojabinurfauzi
//        kelas : IF-3
//        tanggal pengerjaan : 1 Juni 2022

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNoteActivity extends AppCompatActivity {

    EditText title_input, author_input, pages_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_input);
        pages_input = findViewById(R.id.pages_input);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper myDB = new DatabaseHelper(AddNoteActivity.this);
                myDB.addBook(title_input.getText().toString().trim(),
                        author_input.getText().toString().trim());
                Intent pindahIntent  = new Intent(AddNoteActivity.this, NoteListActivity.class);
                startActivity(pindahIntent);
            }
        });
    }
}