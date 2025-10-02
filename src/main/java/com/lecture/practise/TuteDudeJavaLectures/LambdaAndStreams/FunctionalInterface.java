package com.lecture.practise.TuteDudeJavaLectures.LambdaAndStreams;

public class FunctionalInterface {


    public static void main(String[] args) {

        Message send = () -> System.out.println("Sending new message");

    }
}


interface Message {
    public void sendMessage();
}
