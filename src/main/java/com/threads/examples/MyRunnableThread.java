package com.threads.examples;

/**
 * Created by icorda on 21/08/2016.
 */
public class MyRunnableThread{
    public static void main(String[] args){
        //creating the threads - 2 in this case
        Thread myThread1 = new Thread(new MyThreadRunnableExample());
        Thread myThread2 = new Thread(new MyThreadRunnableExample());
        //assign priority to the Threads
        myThread2.setPriority(10);
        myThread1.setPriority(1);
        //starting the thread
        myThread1.start();
        myThread2.start();
        //retrieving the status of the threads
        System.out.println("This is the state of Thread 1 " + myThread1.getState());
        System.out.println("This is the state of Thread 2 " + myThread2.getState());
    }
}
