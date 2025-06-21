package polymorphism;

class A{}
class B extends A{}

class Calculator
{
	 public A add(int a, int b)
	{
		return null;
	}
}

class ScientificCalculator extends Calculator
{
	@Override
	final public A add(int a, int b)
	{
		a=a+b;
		a=a+b+1000;
		return null;
	}
}

public class Demo1 {

}
