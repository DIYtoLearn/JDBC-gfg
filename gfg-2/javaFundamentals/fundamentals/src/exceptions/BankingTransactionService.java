package exceptions;

public class BankingTransactionService 
{
	public void checkBalance(double amtBal,double amtWithdraw)
	{
		System.out.println("validation started");
		
		if(amtBal>amtWithdraw)
		{
			System.out.println("please collect cash "+amtWithdraw);
			amtBal -= amtWithdraw;
			
		}
		else
		{
			try {
				throw new InsufficientBalanceExcepiton("insufficent funds");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("available balance " +amtBal);
		System.out.println("validation complete");
		
	}

}
