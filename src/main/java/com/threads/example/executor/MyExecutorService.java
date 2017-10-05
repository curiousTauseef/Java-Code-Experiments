package com.threads.example.executor;

import java.util.concurrent.*;

/**
 * Implementation of a Single-Thread Executor via the ExecutorService
 *
 * @author icorda
 */
public class MyExecutorService{
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, java.util.concurrent.ExecutionException, TimeoutException{
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("Single-Thread Execution Begins Here");
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) MyExecutorService.counter++;
                System.out.println("Printing my Thread");
            });
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Results Reached");
        } catch (TimeoutException tex) {
            System.out.println("Not Reached in time");
        } finally {
            if (service != null) service.shutdown();
        }
        System.out.println("All Threads have been shutdown");
    }
}
