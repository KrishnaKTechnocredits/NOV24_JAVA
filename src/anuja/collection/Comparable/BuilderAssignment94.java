package anuja.collection.Comparable;
// Attribute : name, city, exp, revenue expecting sorting based on revenue. /
public class BuilderAssignment94 implements Comparable<BuilderAssignment94> {
	String name;
	String city;
	int exp ;
	int revenue;
	
	BuilderAssignment94(String name, int exp , int revenue, String city){
		this.city = city;
		this.exp = exp ;
		this.revenue = revenue ;
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Name: " +name+" , and Revenue-> " +revenue;
	}

	@Override
	public int compareTo(BuilderAssignment94 o) {
		
		return this.revenue - o.revenue;
	}


	
}
