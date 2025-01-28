package imran.CollectionFramework.sorting.Comparable;

public class Builder implements Comparable<Builder>{

	String name, city;
	int experience, revenue;
	
	public Builder(String name, String city, int experience, int revenue) {
		super();
		this.name = name;
		this.city = city;
		this.experience = experience;
		this.revenue = revenue;
	}
	
	public String toString()
	{
		return "name is : " + name + ", city is :" + city + ",  experience is : "+ experience + ",  revenue is : " + revenue +"\n";
	}

	@Override
	public int compareTo(Builder b) {
		return this.revenue-b.revenue;
	}
	
}
