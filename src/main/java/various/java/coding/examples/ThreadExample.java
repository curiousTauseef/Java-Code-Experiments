package various.java.coding.examples;

/*
 * Example for Threads and Concurrency by extending the class Thread
 */

public class ThreadExample extends Thread {

	public void run() {
		System.out.println("the thread is running ...");
		
	}
	
	public static void main (String[] args) {
		ThreadExample myThread1 = new ThreadExample();
		ThreadExample myThread2 = new ThreadExample();
		myThread1.start();
		myThread2.start();
	}

}
