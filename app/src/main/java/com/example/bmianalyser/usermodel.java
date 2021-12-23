package com.example.bmianalyser;

import java.util.ArrayList;

public class usermodel {
    String userName;
    String password;

    public usermodel(String userName, String password, String email, String gender, String birthdate) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    String email;
    String gender;
    String birthdate;
    public usermodel(String Email, String password) {
        this.email = Email;
        this.password = password;

    }




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    ArrayList<bmiModel> model=new ArrayList<bmiModel>();
    ArrayList<foodmodel> foodsmodel=new ArrayList<foodmodel>();
    static usermodel models;


}
