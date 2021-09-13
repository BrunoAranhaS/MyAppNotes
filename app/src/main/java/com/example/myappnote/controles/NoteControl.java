package com.example.myappnote.controles;

import java.util.ArrayList;
import java.util.List;

public class NoteControl {
    private List<Note> notes = new ArrayList();


    public void add(Note note) {
        notes.add(note);
    }

    public void remove(Note note) {
        notes.remove(note);
    }
    public void remove(int pos) {
        notes.remove(pos);
    }

    public List<Note> getNotes() {
        return notes;
    }

    //metodos de pesquisa e ordenação
}
