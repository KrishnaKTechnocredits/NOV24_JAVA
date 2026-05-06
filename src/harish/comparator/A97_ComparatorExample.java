package harish.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A97_ComparatorExample {

	public static void main(String[] args) {

		Builder b1 = new Builder(101, "Lodha", "Mumbai", 13.4, 43.0);
		Builder b2 = new Builder(105, "Heeranandani", "Mumbai", 10.0, 75.0);
		Builder b3 = new Builder(103, "DLF", "Gurgaon", 11.0, 80.0);
		Builder b4 = new Builder(102, "Gera", "Pune", 15.5, 40.6);
		Builder b5 = new Builder(104, "VTP", "Nagpur", 17.2, 54.5);

		List<Builder> builders = new ArrayList<Builder>();
		builders.add(b1);
		builders.add(b2);
		builders.add(b3);
		builders.add(b4);
		builders.add(b5);

		System.out.println("Builders List sorted based on Name: ");
		Collections.sort(builders, new BuilderNameComparator());
		System.out.println(builders);

		System.out.println("Builders List sorted based on Experience: ");
		Collections.sort(builders, new BuilderExperienceComparator());
		System.out.println(builders);

		System.out.println("Builders List sorted in descending order of Revenue: ");
		Collections.sort(builders, new BuilderRevenueComparator());
		System.out.println(builders);
	}
}