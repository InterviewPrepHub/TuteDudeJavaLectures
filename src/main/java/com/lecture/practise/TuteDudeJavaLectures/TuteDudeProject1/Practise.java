package com.lecture.practise.TuteDudeJavaLectures.TuteDudeProject1;

public class Practise {

    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone("iPhone 14", 70000, "Black");
        Smartphone sm2 = new Smartphone("iPhone 12", 50000, "Red");
        Smartphone sm3 = new Smartphone("samsung", 40000, "White");

        Employee e1 = new Employee("John", 101);
        Employee e2 = new Employee("Jane", 102);
        Employee e3 = new Employee("Doe", 103);

        Customer c1 = new Customer("Alice", 80000);
        Customer c2 = new Customer("Bob", 30000);
        Customer c3 = new Customer("Charlie", 60000);

        e1.sellPhone(c1, sm1);
        System.out.println();
        e1.sellPhone(c2, sm1);
    }
}
