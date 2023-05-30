package com.fidho.uts_10120127;

import android.database.Cursor;

import com.fidho.uts_10120127.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);

}
