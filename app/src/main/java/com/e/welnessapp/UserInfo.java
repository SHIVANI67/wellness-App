package com.e.welnessapp;

public class UserInfo {
    public String name, phone, dob, bloodGrp;

    public UserInfo(){
    }

    public UserInfo(String name, String phone, String dob, String bloodGrp) {
        this.name = name;
        this.phone = phone;
        this.dob = dob;
        this.bloodGrp = bloodGrp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }
}
