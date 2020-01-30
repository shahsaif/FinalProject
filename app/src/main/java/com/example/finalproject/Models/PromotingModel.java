package com.example.finalproject.Models;

public class PromotingModel {

    private String Name ;
    private int Photo;
    private int Price ;

    public PromotingModel(){}

    public PromotingModel(String name, int photo, int price) {
        Name = name;
        Photo = photo;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public int getPhoto() {
        return Photo;
    }

    public int getPrice() {
        return Price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
