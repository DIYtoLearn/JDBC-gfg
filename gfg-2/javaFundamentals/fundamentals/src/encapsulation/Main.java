package encapsulation;

public class Main 
{
	public static void main(String[] args) {
		
		Car c = new Car(null, null, 0);
		
		c.setBrand("Honda City");
	
        System.out.println(c.getBrand());
        
        
		
	}

}
