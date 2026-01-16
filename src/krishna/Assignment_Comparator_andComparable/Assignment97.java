package Assignment_Comparator_andComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment97 {

	public static void main(String[] args) {
		List<Assignment97_Employee> listOfEmployee = new ArrayList<Assignment97_Employee>();
		listOfEmployee.add(new Assignment97_Employee("krishna", "biaora", 10, 50000));
		listOfEmployee.add(new Assignment97_Employee("akansha", "indore", 5,18000));
		listOfEmployee.add(new Assignment97_Employee("vishal", "bhopal", 15, 100000));

		Collections.sort(listOfEmployee, new RevenueSorting());
		System.out.println(listOfEmployee);
	}
}
