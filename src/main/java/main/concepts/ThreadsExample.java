package main.concepts;

/*
 * Example for Threads and Concurrency by using the Runnable Interface
 */

public class ThreadsExample implements Runnable {

	@Override
	public void run() {
		//We are just printing the result of a simple loop
		for(int i = 0; i<5; i++) {
			System.out.println("Printing the record number " + i);
			
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Start the Threads example");
		(new Thread(new ThreadsExample())).start(); 
		System.out.println("End the Threads example");
	}
}
