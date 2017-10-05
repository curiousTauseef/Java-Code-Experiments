package com.threads.example.thread.object;

/**
 * @author icorda
 */
public class MyFirstThread{
    public static void main(String[] args){
        //creating 2 thread object
        MultiThreadingExample myThread1 = new MultiThreadingExample();
        MultiThreadingExample myThread2 = new MultiThreadingExample();
        //starting thread execution - 2 threads running
        myThread1.start();
        myThread2.start();
    }
}
