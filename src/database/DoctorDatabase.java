package database;

import models.Doctor;

import java.util.HashMap;

public class DoctorDatabase {
    HashMap<String, Doctor> doctorDB; //here string is doc id

    DoctorDatabase(){
        this.doctorDB = new HashMap<>();
    }
}
