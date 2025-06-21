package lambdaExpressions;

@FunctionalInterface
interface Itr{
	
	int square(int n);
	
}
public class Demo1 
{
   public static void main(String[] args)
   {
	     Itr i =  n-> n*n;
	     System.out.println(i.square(10));
   }
}
