package multiThreading;

class PoliteThread extends Thread {
	private String name;
	
	public PoliteThread(String name) {
    	this.name = name;
	}
	
	public void run() {
    	for (int i = 1; i <= 5; i++) {
        	System.out.println(name + " counting: " + i);
        	Thread.yield(); // Being polite, letting others run
    	}
	}
}
// Using it:
public class YieldExample {
	public static void main(String[] args) {
    	PoliteThread thread1 = new PoliteThread("Thread-1");
    	PoliteThread thread2 = new PoliteThread("Thread-2");
    	thread1.start();
    	thread2.start();
	}
}
