package Assignment_Comparator_andComparable;

import java.util.Comparator;

public class RevenueSorting implements Comparator<Assignment97_Employee>{

	@Override
	public int compare(Assignment97_Employee o1, Assignment97_Employee o2) {
		return o1.getRevenue()-o2.getRevenue();
	}
}
