package com.threads.example.runnable;

/**
 * Created by icorda on 21/08/2016.
 */
public class MyThreadRunnableExample implements Runnable{
    public void run(){
        System.out.println("This thread " + new com.threads.example.runnable.MyRunnableThread() + " is running");
    }
}
