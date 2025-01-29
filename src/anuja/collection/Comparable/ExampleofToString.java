package anuja.collection.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ExampleofToString {
	
	public void m2() {
		
	//lets create a arrraylist
	List<Employee> listOfEmployeeAttr = new ArrayList<Employee>();//becasue empliyee class is generic on and user created
	listOfEmployeeAttr.add(new Employee(1, "anuja", "Electronics",222));
	listOfEmployeeAttr.add(new Employee(2, "Mahendra", "Hello",333));
	listOfEmployeeAttr.add(new Employee(3, "Anku", "Science",444));

	Collections.sort(listOfEmployeeAttr);//cant use on user defined class, need to implememnt comprable
	System.out.println(listOfEmployeeAttr);
	}
	
	public void m1() {
		ArrayList<String> listofName = new ArrayList<String>();
		listofName.add("Anuja");
		listofName.add("Mahendra");
		listofName.add("Anku");
		
		Collections.sort(listofName);
		System.out.println(listofName);
	}
	
	public void m3() {
		
	//lets create a arrraylist
	TreeSet<Employee> listOfEmployeeAttr = new TreeSet<Employee>();//becasue empliyee class is generic on and user created
	listOfEmployeeAttr.add(new Employee(1, "anuja", "Electronics",222));
	listOfEmployeeAttr.add(new Employee(2, "Mahendra", "Hello",333));
	listOfEmployeeAttr.add(new Employee(3, "Anku", "Science",444));

	//Collections.sort(listOfEmployeeAttr);//cant use on user defined class, need to implememnt comprable
	System.out.println(listOfEmployeeAttr);
	}
	
	
	public static void main(String[] args) {
		new ExampleofToString().m2();
		new ExampleofToString().m1();
		//new ExampleofToString().m3();
	}
}
