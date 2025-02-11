package anuja.collection.overrideMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class empClientAssignment97 {
	public static void main(String[] args) {
		List <EmployeeAssignment97> list1 = new ArrayList<EmployeeAssignment97>();
		list1.add(new EmployeeAssignment97("Anuja", "Pune", 5, 50000));
		list1.add(new EmployeeAssignment97("Ankit", "Mumbai", 5, 70000));
		list1.add(new EmployeeAssignment97("MahendraA", "Delhi", 3, 40000));
		list1.add(new EmployeeAssignment97("Aarya", "Bangalore", 6, 60000));
		list1.add(new EmployeeAssignment97("Neha", "Hyderabad", 7, 60000));
		list1.add(new EmployeeAssignment97("Pooja", "Chennai", 2, 40000));
		System.out.println("------------------before sort applies , input is---------------------");
        
        for(EmployeeAssignment97 emp :list1) {
        	System.out.println(emp);
        }
		
		Collections.sort(list1);
		System.out.println("-------------------------------------------");
		
        System.out.println("Employees sorted by Revenue and Experience and logic is there in diff class:");
        
        for(EmployeeAssignment97 emp :list1) {
        	System.out.println(emp);
        }


        
	}
}
