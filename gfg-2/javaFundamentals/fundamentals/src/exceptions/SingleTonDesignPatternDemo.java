package exceptions;

class Demo
{
	static Demo d;
	private Demo()
	{
		
	}
	public static Demo getDemo()
	{
		if(d==null) {
			d= new Demo();
		}
		return d;
	}
	
}

public class SingleTonDesignPatternDemo 
{
	public static void main(String[] args) {
		Demo d1 =Demo.getDemo();
		Demo d2 =Demo.getDemo();
		Demo d3 =Demo.getDemo();
		
		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
		System.out.println(System.identityHashCode(d3));
		}

}
