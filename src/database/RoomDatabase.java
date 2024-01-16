package database;

import models.Room;

import java.util.HashMap;

public class RoomDatabase {
    HashMap<String, Room> roomDB; // here String is roomId

    RoomDatabase(){
        this.roomDB = new HashMap<>();
    }
}
