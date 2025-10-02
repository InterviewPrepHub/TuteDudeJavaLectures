package com.lecture.practise.TuteDudeJavaLectures.TuteDudeProject1;

import lombok.Data;

@Data
public class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void sellPhone(Customer cn, Smartphone sm) {
        if(cn.getAmount() >= sm.getPrice()) {
            cn.buyPhone(sm);
            System.out.println("Employee " + name + " sold " + sm + " to " + cn);
        } else {
            System.out.println("Customer " + cn.getName() + " does not have enough money to buy " + sm);
            //customer can buy the phone on an EMI
            calculateEMI(cn, sm);
        }
    }

    private void calculateEMI(Customer cn, Smartphone sm) {
        double emi = (double) sm.getPrice() / 12;
        String new_emi = String.format("%.2f", emi);
        System.out.println("Customer " + cn.getName() + " can buy " + sm + " on an EMI of " + new_emi);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
