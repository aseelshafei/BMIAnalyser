package com.example.bmianalyser;

public class foodmodel {
    String name,cal,cato;
    int img;


    public foodmodel(String name, String cal, String cato, int img) {
        this.name = name;
        this.cal = cal;
        this.cato = cato;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCal() {
        return cal;
    }

    public void setCal(String desc) {
        this.cal = cal;
    }

    public String getCato() {
        return cato;
    }

    public void setCato(String cato) {
        this.cato = cato;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}
