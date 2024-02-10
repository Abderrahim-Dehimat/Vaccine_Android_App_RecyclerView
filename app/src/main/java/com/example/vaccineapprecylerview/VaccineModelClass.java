package com.example.vaccineapprecylerview;

public class VaccineModelClass {

    private int vaccineImg;
    private String vaccineName;

    public VaccineModelClass(int vaccineImg, String vaccineName) {
        this.vaccineImg = vaccineImg;
        this.vaccineName = vaccineName;
    }

    public int getVaccineImg() {
        return vaccineImg;
    }

    public void setVaccineImg(int vaccineImg) {
        this.vaccineImg = vaccineImg;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
}
