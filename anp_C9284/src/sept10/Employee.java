package sept10;

import java.util.*;

public class Employee {

	
	int id ;
	String name;
	
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
	
	public Employee() {};
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

	public static void main(String[] args) {
		
		TreeSet<Employee>	treeset= new TreeSet<Employee>();
			
			
			
	}
	

		
		
		
	
}
