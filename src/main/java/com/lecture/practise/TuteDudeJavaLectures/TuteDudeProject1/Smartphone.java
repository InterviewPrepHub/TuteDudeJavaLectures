package com.lecture.practise.TuteDudeJavaLectures.TuteDudeProject1;

import lombok.Data;

@Data
public class Smartphone {

    private String model;
    private int price;
    private String colour;

    public Smartphone(String model, int price, String colour) {
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return model+" "+price+" "+colour;
    }
}
