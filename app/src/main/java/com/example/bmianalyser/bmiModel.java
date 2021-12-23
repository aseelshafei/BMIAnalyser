package com.example.bmianalyser;

public class bmiModel {
    public bmiModel(String lenght, String wieght, String date) {
        this.lenght = lenght;
        this.wieght = wieght;
        this.date = date;
    }

    String lenght,wieght,date;

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getWieght() {
        return wieght;
    }

    public void setWieght(String wieght) {
        this.wieght = wieght;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
