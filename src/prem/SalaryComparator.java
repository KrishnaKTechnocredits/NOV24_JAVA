package prem;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee1>{

		public int compare(Employee1 o1, Employee1 o2) {
			return o1.salary-o2.salary;
		
	}

}
