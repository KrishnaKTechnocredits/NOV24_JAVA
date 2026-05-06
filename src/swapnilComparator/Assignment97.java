package swapnilComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment97 {
	
	void sortEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Swapnil",8284,34,300000));
		list.add(new Employee("Dhanu",1010,32,200000));
		list.add(new Employee("Shree",2345,35,100000));
		list.add(new Employee("Preeti",8484,30,300000));
		
		Collections.sort(list,new Age());
		System.out.println(list);
		Collections.sort(list, new Salary());
		System.out.println(list);
		Collections.sort(list, new Name());
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		Assignment97 a = new Assignment97();
		a.sortEmployee();
	}
}
