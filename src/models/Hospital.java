package models;

import database.DoctorDatabase;
import database.PatientDatabase;
import database.RoomDatabase;

public class Hospital {
    private String name;
    private String address;
    private long phoneNumber;
    private String emailId;
    private PatientDatabase patientDatabase;
    private DoctorDatabase doctorDatabase;
    private RoomDatabase roomDatabase;

    public Hospital(String name, String address, long phoneNumber, String emailId) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.patientDatabase = new PatientDatabase();
        this.doctorDatabase = new DoctorDatabase();
        this.roomDatabase = new RoomDatabase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void admitPatient(String name,int age,long phoneNumber,String email,String gender,String disease){
        //now it is the work of the hospital to assign Doctor,Room,And patientId to the patient.
        //After that we will create patient obj.
        //and we will use our database to save that patient obj

        //1.generate patient id.
        int totalPatientCount = patientDatabase.getTotalPatientCount() + 1;
        String pId = "PID" + totalPatientCount;
        //2.get the doctor who is handling minimum no.of patients
        Doctor doctor = doctorDatabase.getMinimumPatientDoctor();

        //3 get room which is not occupied.
        Room room = roomDatabase.getUnoocupiedRoom();
        room.setOccupied(true);

        //create patient obj.
        Patient p = new Patient(pId,name,age,phoneNumber,email,gender,disease,doctor,room,true);
        doctor.patientList.add(p);
        patientDatabase.addPatient(p);
        System.out.println("Patient got admitted successfully -> " + p);

    }

    public void createRoom(){
        String roomId = "RoomId" + (roomDatabase.getTotalRooms() +1);
        Room room = new Room(roomId,false,null,null);
        roomDatabase.addRoomToDB(room);
        System.out.println("Room added successfully ->" + room);
    }
    public void appointDoctor(String docDegree,String name,long phoneNumber,String speciality,int salary,String timeSlot){
        String docId = "DOCID" + (doctorDatabase.getTotalDoctors() + 1);
        Doctor doc = new Doctor(docId,docDegree,name,phoneNumber,speciality,salary,timeSlot);
        doctorDatabase.addDoctorToDB(doc);
        System.out.println("Doctor created successfully -> " + doc);
    }
}
