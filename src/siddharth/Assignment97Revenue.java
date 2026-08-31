package siddharth;

import java.util.Comparator;

public class Assignment97Revenue implements Comparator<Assignment97Employee> {

	@Override
	public int compare(Assignment97Employee o1, Assignment97Employee o2) {
		return o1.revenue-o2.revenue;
	}
	
	
}
