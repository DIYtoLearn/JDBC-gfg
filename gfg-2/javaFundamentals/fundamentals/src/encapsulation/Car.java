package encapsulation;

public class Car 
{
	private String brand;
	private String color;
	private double price;
	
	public Car(String brand, String color, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		 this.brand=brand;
	}
	


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	void start()
	{
		
	}
	
	void stop()
	{
		
	}

	void run()
	{
		
	}
	
	void brake()
	{
		
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
}
