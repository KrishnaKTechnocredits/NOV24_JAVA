package siddharth;

import java.util.Comparator;

public class Assignment97exp implements Comparator<Assignment97Employee> {

	@Override
	public int compare(Assignment97Employee o1, Assignment97Employee o2) {
		return o1.exp - o2.exp;
	}

}
