package fazrana.compare;

import java.util.Comparator;

public class ExpSortClass implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.expense-o2.expense;
	}

}
