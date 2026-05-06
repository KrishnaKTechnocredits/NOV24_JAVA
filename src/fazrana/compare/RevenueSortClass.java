package fazrana.compare;

import java.util.Comparator;

public class RevenueSortClass implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.revenue-o2.revenue;
	}

}
