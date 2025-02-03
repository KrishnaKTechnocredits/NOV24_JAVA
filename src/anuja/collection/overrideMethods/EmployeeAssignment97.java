package anuja.collection.overrideMethods;
//Create a class called Employee, define few variables and provide a mechanism to initialise them while creating an object.
//Create an ArrayList, add few builders object in the Arraylist and sort them based on multiple parameter.
//
//Attribute : name, city, exp, revenue
//expecting sorting based on revenue and exp. 
//
//make sure while you print the list after sorting, it should print name, revenue, exp in sorted order of revenue.
public class EmployeeAssignment97 implements Comparable<EmployeeAssignment97>{

	String name;
	String city;
	int exp;
	int revenue;
	
	EmployeeAssignment97(String name, String city ,int exp,int revenue){
		this.name = name;
		this.city = city;
		this.exp = exp;
		this.revenue = revenue;
	}

	

	@Override// compareTo
	public int compareTo(EmployeeAssignment97 o) {
		if(this.revenue != o.revenue) {
			return Integer.compare(this.revenue, o.revenue);
		}else {
			return this.exp -o.exp;
		}
	}
	
	@Override //toString
	public String toString() {
		return " name "+name+" revenue "+revenue+" exp "+exp ;
	} 
}
