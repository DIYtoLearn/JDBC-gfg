package multithreading;

public class VideoDownloading  implements Runnable 
{


	public void run()
	{
		System.out.println("downloading start");
		System.out.println(Thread.currentThread());

		for (int i = 10; i <=100; i=i+10) {
			System.out.println("downloading..."+i+"%");
			try {
				Thread.sleep(1000);
				throw new RuntimeException();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("downloading end");	
	}
}
