package multiThreading;

class LongTask extends Thread {
	public void run() {
    	try {
        	System.out.println("Starting a long task...");
        	// Simulate long work with sleep
        	Thread.sleep(10000); // 10 seconds
        	System.out.println("Task completed!");
    	} catch (InterruptedException e) {
        	System.out.println("Sorry, I was interrupted!");
        	System.out.println("Cleaning up before stopping...");
    	}
	}
}
 
// Using it:
public class InterruptExample {
	public static void main(String[] args) {
		System.out.println("main start");
    	LongTask task = new LongTask();
    	task.start();
    	
    	// Wait for 3 seconds then interrupt
    	try {
        	Thread.sleep(3000);
    	} catch (InterruptedException e) {}
    	
    	task.interrupt();
    	System.out.println("main end");
	}
}
