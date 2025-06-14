package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Employee i) {
		// TODO Auto-generated method stub
		if(this.id > i.id)
		{
			return 1;
		}
		else if(this.id < i.id)
		{
			return -1;
		}
		else	
		{		
			return 0;
		}
	}
	
	
}

class MyEmployeeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return -o1.compareTo(o2);
		
	}


	
}

public class SetDemo 
{
	public static void main(String[] args) 
	{
//		TreeSet hs = new TreeSet();
//		hs.add(Integer.valueOf(10));
//		hs.add(10);
//		hs.add(20);
//		hs.add(30);
//		hs.add(160);
//		hs.add(104);
//		System.out.println(hs);
		
		TreeSet<Employee> hs = new TreeSet<Employee>(new MyEmployeeComparator());
		hs.add(new Employee(1,"syed"));
		hs.add(new Employee(3,"saqib"));
		hs.add(new Employee(2,"rahul"));
		
		System.out.println(hs);
		
		//hs.hashCode()
		
		
		
		
	}

}
