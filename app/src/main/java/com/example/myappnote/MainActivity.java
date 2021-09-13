package com.example.myappnote;

import static com.example.myappnote.controles.Singleton.getNoteControl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.myappnote.controles.NoteControl;
import com.example.myappnote.controles.Singleton;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    NoteControl ctrl = getNoteControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctrl.getNotes();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.miNewNote:
                //ir para a activity de cadastrar nova anotação
                Intent intent = new Intent(this, NewNoteActivity.class);

                startActivity(intent);
                break;
            case R.id.miOrderPrior:
                //pegar a lista de noteControl e realizar a ordenação desejada
                //posteriormente recriar a lista na tela
                break;
            case R.id.miOrder:
                //pegar a lista de noteControl e realizar a ordenação desejada
                //posteriormente recriar a lista na tela
                break;
            case R.id.miFechar:
                //finalizar app
                finish();

        }

        return super.onOptionsItemSelected(item);
    }
}