package multiThreading;

public class AutoSaveExample {
    public static void main(String[] args) {
        // Create a thread for auto-save functionality
        AutoSaveTask autoSaveTask = new AutoSaveTask();
        Thread autoSaveThread = new Thread(autoSaveTask);

        // Set the thread as a daemon
        autoSaveThread.setDaemon(true);
        autoSaveThread.setPriority(1);

        // Start the auto-save thread
        autoSaveThread.start();

        // Simulate user activity in the main thread
        try {
            System.out.println("User is working...");
            Thread.sleep(5000); // Simulate 5 seconds of user work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("User closed the application. Auto-save will stop.");
    }
}

// Task for auto-saving a document
class AutoSaveTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Auto-saving document...");
            try {
                Thread.sleep(1000); // Save every 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

