package me.mehadih.architectureexample.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import me.mehadih.architectureexample.room.Note;

@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE from note_table")
    void delete_all();

    @Query("SELECT * FROM NOTE_TABLE ORDER BY PRIORITY DESC")
    LiveData<List<Note>> getAllNotes();
}
