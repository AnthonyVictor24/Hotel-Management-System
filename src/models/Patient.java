package models;

public class Patient {
    String pId;
    String name;
    int age;
    long phoneNumber;
    String email;
    String gender;
    String disease;
    Doctor doctor;
    Room room;
    boolean isAdmit;

    public Patient(String pId, String name, int age, long phoneNumber, String email, String gender, String disease,Doctor doctor,Room room,boolean isAdmit) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor = doctor;
        this.room = room;
        this.isAdmit = isAdmit;
    }


    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pId='" + pId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", doctor=" + doctor +
                ", room=" + room +
                ", isAdmit=" + isAdmit +
                '}';
    }
}
