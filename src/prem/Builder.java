package prem;



public class Builder implements Comparable<Builder>{
	String city;
	String name;
	int exp;
	int revenue;
	
	    Builder(String name,String city, int exp, int revenue){
		this.name = name;
		this.city =city;
		this.exp = exp;
		this.revenue =revenue;
	    }
		
		public String toString() {
			return "name: " +name+ ", revenue: "+revenue; 
		}
		
		public int compareTo(Builder b) {
			return this.revenue -b.revenue;
		}	
		
	}
