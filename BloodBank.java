package com.company.Model;

public class BloodBank {
    private String bloodBankName;
    private int orders;
    private String address;


    public BloodBank() {
    }

    public BloodBank(String bloodBankName, int orders, String address) {
        this.bloodBankName = bloodBankName;
        this.orders = orders;
        this.address = address;
    }

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
