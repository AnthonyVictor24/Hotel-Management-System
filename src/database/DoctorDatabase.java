package database;

import models.Doctor;
import models.Patient;

import java.util.HashMap;
import java.util.List;

public class DoctorDatabase {
    HashMap<String, Doctor> doctorDB; //here string is doc id

    public DoctorDatabase(){
        this.doctorDB = new HashMap<>();
    }
    public Doctor getMinimumPatientDoctor(){
        Doctor minDoc = null;
        int min = Integer.MAX_VALUE;
        for(String key : doctorDB.keySet()){
            Doctor doc = doctorDB.get(key);
            List<Patient> patientList = doc.getPatientList();
            if(patientList.size() < min){
                minDoc = doc;
                min = patientList.size();
            }
        }
        return minDoc;
    }

    public void addDoctorToDB(Doctor doctor){
        String docId = doctor.getDocId();
        doctorDB.put(docId,doctor);
    }
    public Doctor getDoctorID(String id){
        return doctorDB.get(id);
    }

    public int getTotalDoctors(){
        return doctorDB.size();
    }
}
