package siddharth;



public class Assignment97Employee{
	
	String name;
	String empId;
	int exp;
	int revenue;
	
	public Assignment97Employee(String name,String empId,int exp,int revenue) {
		this.name = name;
		this.empId = empId;
		this.exp = exp;
		this.revenue = revenue;
	}
	
	public String toString() {
		return "Name=" + name + ", Employee ID=" + empId + ", Exp=" + exp + ", Revenue=" + revenue;
	}

}
