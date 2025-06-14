package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BankingMain 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("welcome to gfg bank");
		BankingTransactionService bt = new BankingTransactionService();
			bt.checkBalance(16000, 2600);		
		System.out.println("thank you");
		
		
		try(FileReader f = new FileReader("Demo.txt")) 
		{
			
		}
	
	}

}
