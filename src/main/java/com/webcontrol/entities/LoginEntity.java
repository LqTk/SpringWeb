package com.webcontrol.entities;

public class LoginEntity {
    int userId;
    String name;
    String phone;
    String picUrl;

    public LoginEntity(int userId, String name, String phone, String picUrl) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.picUrl = picUrl;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.name = picUrl;
    }

    @Override
    public String toString() {
        return "LoginEntity{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }
}
