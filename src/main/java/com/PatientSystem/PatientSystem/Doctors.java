package com.PatientSystem.PatientSystem;

public class Doctors {

    private String doctorsName;

    private int doctorsId;


    Doctors(String doctorsName, int doctorsId){
        this.doctorsName = doctorsName;
        this.doctorsId = doctorsId;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public int getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(int doctorsId) {
        this.doctorsId = doctorsId;
    }
}
