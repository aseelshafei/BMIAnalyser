package com.example.bmianalyser;

public class foodmodel {
    String name,desc,cato;
    int img;


    public foodmodel(String name, String desc, String cato, int img) {
        this.name = name;
        this.desc = desc;
        this.cato = cato;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
