package swapnil;

public class Assignment94 implements Comparable<Assignment94> {
	
	String name;
	String city;
	int expense;
	int revenue;
	
	Assignment94(String name,String city,int expense,int revenue){
	this.name=name;
	this.city=city;
	this.expense=expense;
	this.revenue=revenue;	
	}
	@Override
	public String toString() {
		return "name:"+name+", revenue:"+revenue;
	}
	@Override
	public int compareTo(Assignment94 a) {
		return this.revenue-a.revenue;
	}
}
