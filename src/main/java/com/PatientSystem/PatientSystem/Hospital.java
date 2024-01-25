package com.PatientSystem.PatientSystem;

import java.util.*;

public class Hospital {

    private String hospitalName;

    private int hospitalID;

    private int numberOfOxygenCylinders;

    private int numberOfBeds;

    private long contactNumber;

    private String email;


    List<Beds> bedsList;

    List<Patient> patientList;

    private List<Doctors> doctorsList;

    public List<Beds> getBedsList() {
        return bedsList;
    }

    public void setBedsList(List<Beds> bedsList) {
        this.bedsList = bedsList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public List<Doctors> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(List<Doctors> doctorsList) {
        this.doctorsList = doctorsList;
    }

    public Hospital(int hospitalID, int numberOfBeds, String hospitalName, int numberOfOxygenCylinders, long contactNumber, String email){
        this.hospitalID = hospitalID;
        this.hospitalName = hospitalName;
        this.numberOfBeds = numberOfBeds;
        this.numberOfOxygenCylinders = numberOfOxygenCylinders;
        this.contactNumber = contactNumber;
        patientList = new ArrayList<>();
        doctorsList = new ArrayList<>();
        this.email = email;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }

    public int getNumberOfOxygenCylinders() {
        return numberOfOxygenCylinders;
    }

    public void setNumberOfOxygenCylinders(int numberOfOxygenCylinders) {
        this.numberOfOxygenCylinders = numberOfOxygenCylinders;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
