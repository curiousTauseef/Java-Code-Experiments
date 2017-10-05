package com.threads.examples;

/**
 * Created by icorda on 21/08/2016.
 */
public class MyThreadForExecutorService implements Runnable{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number  " + i + " is running");
        }
    }
}
