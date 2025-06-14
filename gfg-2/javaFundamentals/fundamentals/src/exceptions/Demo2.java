package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo2 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}
	
	public static void m1() throws FileNotFoundException
	{
		System.out.println("m1 start");
		m2();
		System.out.println("m1 end");
		
	}
	
	public static void m2() throws FileNotFoundException
	{
		System.out.println("m2 start");
		FileReader f = new FileReader("Demo.txt");
	}

}
