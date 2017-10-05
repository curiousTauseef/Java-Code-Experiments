package com.threads.examples;

/**
 * Created by icorda on 21/08/2016.
 */
public class MyThreadRunnableExample implements Runnable{
    public void run(){
        System.out.println("This thread " + new com.threads.examples.MyRunnableThread() + " is running");
    }
}
