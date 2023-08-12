package com.memo10120062;

import android.database.Cursor;
import com.memo10120062.model.Note;

/**
 * 10120062
 * Ahmad Sanosi
 * IF-2
 */

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

