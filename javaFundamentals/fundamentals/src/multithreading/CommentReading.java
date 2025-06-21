package multithreading;

public class CommentReading  implements Runnable{

	public void run()
	{
		 System.out.println("comment reading start");
		 for (int i = 0; i < 5; i++) {
				System.out.println("comments ... "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		 System.out.println("comment reading end");
	}
}
