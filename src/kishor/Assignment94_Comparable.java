package kishor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment94_Comparable {
	
	static void displaySortedList() {
		List<Assignment94_Builder> list = new ArrayList<Assignment94_Builder>();
		list.add(new Assignment94_Builder("VTP","PUNE",10,50000));
		list.add(new Assignment94_Builder("KOHINOOR","DELHI",7,40000));
		list.add(new Assignment94_Builder("LODHA","THANE",16,70000));
		list.add(new Assignment94_Builder("AMAN","NAGPUR",4,24000));
		
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		displaySortedList();
	}
}
