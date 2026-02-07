package roshan.comperatorAssignment97;

import java.util.Comparator;

public class Revenuecomparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.revenue - e2.revenue;
	}
}
