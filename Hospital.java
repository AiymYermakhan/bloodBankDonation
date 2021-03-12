package com.company.Model;

public class Hospital {
    private String hospitalName;
    private String address;
    private String bloodBankName;

    public Hospital() {
    }

    public Hospital(String hospitalName, String address, String bloodBankName) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.bloodBankName = bloodBankName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address='" + address + '\'' +
                ", bloodBankName='" + bloodBankName + '\'' +
                '}';
    }
}
