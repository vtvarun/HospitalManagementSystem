package com.PatientSystem.PatientSystem;

public class Beds {

    int bedNumber;

    private boolean o2cylinderAvailable;

    private boolean DoctorsToolKitAvailable;

    private boolean FirstAidAvailable;

    private boolean sanitizerAvailable;

    Beds(int bedNumber, boolean o2cylinderAvailable, boolean DoctorsToolKitAvailable, boolean firstAidAvailable, boolean sanitizerAvailable){
        this.bedNumber = bedNumber;
        this.DoctorsToolKitAvailable = DoctorsToolKitAvailable;
        this.FirstAidAvailable = firstAidAvailable;
        this.sanitizerAvailable = sanitizerAvailable;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public boolean isO2cylinderAvailable() {
        return o2cylinderAvailable;
    }

    public void setO2cylinderAvailable(boolean o2cylinderAvailable) {
        this.o2cylinderAvailable = o2cylinderAvailable;
    }

    public boolean isDoctorsToolKitAvailable() {
        return DoctorsToolKitAvailable;
    }

    public void setDoctorsToolKitAvailable(boolean doctorsToolKitAvailable) {
        DoctorsToolKitAvailable = doctorsToolKitAvailable;
    }

    public boolean isFirstAidAvailable() {
        return FirstAidAvailable;
    }

    public void setFirstAidAvailable(boolean firstAidAvailable) {
        FirstAidAvailable = firstAidAvailable;
    }

    public boolean isSanitizerAvailable() {
        return sanitizerAvailable;
    }

    public void setSanitizerAvailable(boolean sanitizerAvailable) {
        this.sanitizerAvailable = sanitizerAvailable;
    }
}
