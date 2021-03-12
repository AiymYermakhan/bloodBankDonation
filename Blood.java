package com.company.Model;

public class Blood {
    private int bloodCode;
    private int bloodGroup;
    private int cost;
    private int donorId;

    public Blood() {
    }

    public Blood(int bloodCode, int bloodGroup, int cost, int donorId) {
        this.bloodCode = bloodCode;
        this.bloodGroup = bloodGroup;
        this.cost = cost;
        this.donorId = donorId;
    }

    public int getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(int bloodCode) {
        this.bloodCode = bloodCode;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }
}