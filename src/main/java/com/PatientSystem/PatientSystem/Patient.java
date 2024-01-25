package com.PatientSystem.PatientSystem;

public class Patient {

    private int patient_id;

    private String patient_Name;

    private Doctors doctorAssigned;

    private Beds bedGiven;

    public Patient(int patient_id, String patient_Name, Doctors doctorAssigned, Beds bedGiven) {
        this.patient_id = patient_id;
        this.patient_Name = patient_Name;
        this.doctorAssigned = doctorAssigned;
        this.bedGiven = bedGiven;
    }
}
