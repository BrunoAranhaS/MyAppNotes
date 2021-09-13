package com.example.myappnote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myappnote.controles.Note;
import com.example.myappnote.controles.NoteControl;
import com.example.myappnote.controles.Singleton;

public class NewNoteActivity extends AppCompatActivity {

    private EditText etTitulo, etDescription;
    private Button btGravar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        //conecta a view com o elemento
        etTitulo = findViewById(R.id.etTitulo);
        etDescription = findViewById(R.id.etDescription);
        btGravar = findViewById(R.id.btGravar);

        btGravar.setOnClickListener(view -> {
            Note newNote = new Note();

            Singleton.getNoteControl().add(newNote);
        });

    }
}