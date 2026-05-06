package pooja.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_94_runner {

	void getRevenue() {
		List<Assignment_94> listOfBuilder = new ArrayList<Assignment_94>();
		listOfBuilder.add(new Assignment_94("Pooja", "Pune", 29, 200000));
		listOfBuilder.add(new Assignment_94("Maulik", "Surat", 37, 900000));
		listOfBuilder.add(new Assignment_94("Aarti", "Solapur", 28, 500000));
		listOfBuilder.add(new Assignment_94("Shuhham", "Mumbai", 25, 300000));
		System.out.println("Before Sorting : ");
		System.out.println(listOfBuilder);
		System.out.println("After Sorting : ");
		Collections.sort(listOfBuilder);
		System.out.println(listOfBuilder);
	}

	public static void main(String[] args) {
		Assignment_94_runner assignment_94_runner = new Assignment_94_runner();
		assignment_94_runner.getRevenue();
	}
}