package imran.CollectionFramework.sorting.Comparator;

public class Builders {

	String name,city;
	int experience, revenue;
		
	public Builders(String name, String city, int experience, int revenue) {
		super();
		this.name = name;
		this.city = city;
		this.experience = experience;
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "Name is: "+ name +", city is: "+ city +", experience is: "+ experience +", revenue is: "+ revenue + "\n";
	}
	
	
}
