package inheritance;


class Parent
{
	int x =10 ;          // non  static / instance variables   
	static int y = 20;  // static / class variable


	void m1(int x) // local varibles
	{
		//		int z=10;
		//		
		//		if()
		//		{
		//			int z=10;
		//		}

	}

	static void m2(int z)
	{
		int w=10;
		System.out.println();


	}

	

	{

	}

	static {

	}

}

class Child extends Parent
{

}


public class Demo1
{
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		System.out.println(  p.x);

		Parent.m2(10);
		
		Child.m2(0);
		
		Child c = new Child();
		c.m1(1);
			
		


	}
}
