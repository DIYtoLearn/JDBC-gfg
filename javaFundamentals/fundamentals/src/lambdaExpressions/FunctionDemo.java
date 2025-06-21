package lambdaExpressions;

import java.util.function.Function;

public class FunctionDemo
{
	public static void main(String[] args)
	{
		Function<Integer,Integer> squareNum = I->I*I;
		
		Function<Integer,Integer> doubleNum = I->2*I;
		
		System.out.println(squareNum.andThen(doubleNum).apply(3));
		
		System.out.println(squareNum.compose(doubleNum).apply(3));
		
		System.out.println(doubleNum.andThen(squareNum).apply(3));
       
		
		
		
		
	}

}
