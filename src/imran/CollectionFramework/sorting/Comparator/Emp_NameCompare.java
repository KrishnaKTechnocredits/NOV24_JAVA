package imran.CollectionFramework.sorting.Comparator;

import java.util.Comparator;

public class Emp_NameCompare implements Comparator <Employees>{

	@Override
	public int compare(Employees E1, Employees E2) {
		
		return E1.name.compareTo(E2.name);
	}

}
