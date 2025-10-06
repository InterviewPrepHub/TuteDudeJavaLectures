package com.lecture.practise.TuteDudeJavaLectures.Concurrency.Futures;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureBasic {

    public static void main(String[] args) {
        // run async on ForkJoinPool.commonPool() by default
        CompletableFuture<Integer> cf =
                CompletableFuture.supplyAsync(() -> slowAdd(10, 20)) // returns 30
                        .thenApply(sum -> sum * 2)          // 60
                        .thenApply(x -> x + 1);             // 61

        // Non-blocking: do other things ...
        System.out.println("Doing other stuff...");

        // If you need the final value:
        System.out.println("Final = " + cf.join()); // join() = like get() but unchecked
    }

    static int slowAdd(int a, int b) {
        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        return a + b;
    }
}
