package com.example.myappnote.controles;

public class Singleton {
    private static NoteControl noteControl;

    private Singleton() {

    }

    public static NoteControl getNoteControl() {
        if(noteControl == null)
            noteControl  = new NoteControl();
        return noteControl;
    }
}
