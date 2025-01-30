package ashwini.collections;

import java.util.Comparator;

public class ExpComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.exp-o2.exp;
	}
	

}
