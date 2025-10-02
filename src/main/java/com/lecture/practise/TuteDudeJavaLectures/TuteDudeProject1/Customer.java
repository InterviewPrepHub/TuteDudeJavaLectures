package com.lecture.practise.TuteDudeJavaLectures.TuteDudeProject1;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private int amount;

    public Customer(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void buyPhone(Smartphone sm) {
        System.out.println("Customer " + name + " bought " + sm);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
