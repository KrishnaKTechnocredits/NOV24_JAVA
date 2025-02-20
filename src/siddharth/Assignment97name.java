package siddharth;

import java.util.Comparator;

public class Assignment97name implements Comparator<Assignment97Employee> {

	@Override
	public int compare(Assignment97Employee o1, Assignment97Employee o2) {
		return o2.name.compareTo(o1.name);
	}

}
