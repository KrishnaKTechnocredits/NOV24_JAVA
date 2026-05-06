package roshan.comperatorAssignment97;

import java.util.Map;
import java.util.TreeMap;

public class GetInput {
	void M1() {
		Map<Employee, Integer> maplist = new TreeMap<>(new Revenuecomparator()); // as we are sorting on revenue in
																					// constructor revenue implemented
																					// class HashMap does not accept a
																					// comparator
																					// in its constructor Only TreeMap
																					// accepts a comparator because it
																					// maintains sorted order of keys.
		maplist.put(new Employee("roshan", "Nagpur", 12, 120000), 01);
		maplist.put(new Employee("ketan", "pune", 15, 1550000), 02);
		maplist.put(new Employee("vishal", "thane", 3, 90000), 03);
		maplist.put(new Employee("verma", "petpura", 25, 13000), 04);

		System.out.println(maplist);

	}

	public static void main(String[] args) {
		new GetInput().M1();
	}

}
