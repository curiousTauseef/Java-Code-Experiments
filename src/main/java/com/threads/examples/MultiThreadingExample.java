package com.threads.examples;

/**
 * @author icorda
 */

public class MultiThreadingExample extends Thread{
    public void run(){
        //This returns the ids of the running threads
        System.out.println("This thread is running " + MultiThreadingExample.currentThread().getId());
        //This gets the name of the current thread
        String currentThreadName = MultiThreadingExample.currentThread().getName().toString();
        System.out.println("This is the name of the current thread " + currentThreadName);
    }
}
