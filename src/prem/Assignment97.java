package prem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment97 {

	void sortEmployee() {
		List <Employee1> listOfEmployee=new ArrayList<Employee1>();
		listOfEmployee.add(new Employee1("Meenu", "pune", 10, 125000));
		listOfEmployee.add(new Employee1("robin", "Mumbai", 3, 150000));
		listOfEmployee.add(new Employee1("Avi", "meerut", 8, 45000));
		listOfEmployee.add(new Employee1("Ishaan", "pune", 20, 20000));
		Collections.sort(listOfEmployee,new ExperienceComparator());
		System.out.println(listOfEmployee);
		Collections.sort(listOfEmployee,new SalaryComparator());
		System.out.println(listOfEmployee);
	}
		public static void main(String[] args) {
			Assignment97 assign97=new Assignment97();
			assign97.sortEmployee();

			}

}
