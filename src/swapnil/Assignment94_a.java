package swapnil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment94_a {
	
	void m1() {
		List<Assignment94> list = new ArrayList<Assignment94>();
		list.add(new Assignment94("Swapnil","Pune",10000,5000000));
		list.add(new Assignment94("dhanu","Akola",10000,50000));
		list.add(new Assignment94("shree","nagar",10000,5000));
		list.add(new Assignment94("prisha","Pune",10000,500000));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	public static void main(String[] args) {
		Assignment94_a a = new Assignment94_a();
		a.m1();
	}
	
}
