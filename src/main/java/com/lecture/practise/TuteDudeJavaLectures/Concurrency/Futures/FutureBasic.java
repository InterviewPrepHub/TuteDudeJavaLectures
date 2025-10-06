package com.lecture.practise.TuteDudeJavaLectures.Concurrency.Futures;

import java.util.concurrent.*;

public class FutureBasic {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //1. Make a pool of worker threads
        ExecutorService pool = Executors.newFixedThreadPool(2);

        //2. Define a task that returns something
        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };

        //3. submit the task -> get a future
        Future<Integer> future = pool.submit(task); //submit the background task

        //4. Do other work while it runs...
        System.out.println("Doing other stuff......");  //background thread starts executing task.call() [sleeping 1 sec]

        //5. Later: wait for the result(this call blocks)
        //sNow the main thread stops here and waits for the background thread to finish.
        Integer result = future.get();  //  <-- 🧱 blocking happens here
        System.out.println("Result : "+result); //waits upto completion

        pool.shutdown();
    }
}
