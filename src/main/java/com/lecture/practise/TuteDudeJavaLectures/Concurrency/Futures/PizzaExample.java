package com.lecture.practise.TuteDudeJavaLectures.Concurrency.Futures;

import java.util.concurrent.*;

public class PizzaExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService kitchen = Executors.newSingleThreadExecutor();

        //the callable is chef here who is actually doing the task of baking pizza
        Callable<String> chef = () -> {
            System.out.println("Chef : Baking your pizza...");
            Thread.sleep(2000);
            return "pizza is ready";
        };

        // You place the order and get the receipt
        Future<String> receipt = kitchen.submit(chef);

        System.out.println("Customer doing other stuff while waiting");

        //Later you use the receipt to get your pizza
        String pizza = receipt.get();
        System.out.println("Customer: Got it! "+pizza);

        kitchen.shutdown();
    }
}
