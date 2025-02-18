package kishor;

public class Assignment97_Builder {
	
	String name;
	String city;
	int experience;
	int revenue;
	
	Assignment97_Builder(String name, String city,int experience, int revenue){
		this.name=name;
		this.city=city;
		this.experience=experience;
		this.revenue=revenue;
		
	}
	
	public String toString() {
		return "Name:- "+name + " Revenue:- "+revenue +" Experience:- "+experience;
	}
}
