package abstraction;

interface A
{
	 int X=10;
	 void m1();
}
class B implements A
{

	@Override
	public void m1() {
		System.out.println("imp");	
	}		
}

public class Demo1 {

}
