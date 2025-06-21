package multithreading;

public class YoutubeMain 
{
	public static void main(String[] args) 
	{
		VideoStreaming vs = new VideoStreaming();
		CommentReading cr = new CommentReading();
		VideoDownloading vd = new VideoDownloading();
		
		Thread t1 = new Thread(vs,"vs");
		Thread t2 = new Thread(cr,"cr");
		Thread t3 = new Thread(vd,"vd");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	
		
		
	
		
//		vs.run();
//		cr.run();
//		vd.run();
		
	}

}
