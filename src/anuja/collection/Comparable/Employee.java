package anuja.collection.Comparable;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name ;
	String department;
	int phone;
	
	Employee (int id , String name, String department , int phone){
		this.id = id;
		this.name = name;
		this.department =department;
		this.phone = phone;
	}
	
	@Override
	public String toString(){
		return "name :" +name +" ,id: "+ id +" ,departemnt: " +department +" ,phone : " +phone;
		
	}

	@Override
	public int compareTo(Employee o) {

		return this.phone - o.phone;
	}

	
}
