import models.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital("XYZ","ADDXYZ",123,"XYZ@");
        h.appointDoctor("MBBS","Victor",73389,"Heart surgeon",100000,"12.30 - 3.30");
        h.createRoom();
        h.admitPatient("Vicky",26,75502,"vicky@007","Male","Nothing");
//        h.admitPatient("Bindu",26,99988,"appu@007","female","NoseProblem");
        //Ask how to add another patient.
    }
}