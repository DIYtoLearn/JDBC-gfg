package multithreading;

public class VideoStreaming implements Runnable
{
	public void run()
	{
		 System.out.println("video streaming start");
		 for (int i = 0; i < 5; i++) {
			System.out.println("video streaming...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 System.out.println("video streaming end");
	}
	
}
