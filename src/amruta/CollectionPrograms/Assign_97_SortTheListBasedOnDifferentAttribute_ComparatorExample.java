package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assign_97_SortTheListBasedOnDifferentAttribute_ComparatorExample {

	public static void main(String[] args) {
		Assign_97_BuilderClass b1 = new Assign_97_BuilderClass(402, "Clover", "Pune", 30, 34.00);
		Assign_97_BuilderClass b2 = new Assign_97_BuilderClass(755, "Evershine", "Mumbai", 35, 27.00);
		Assign_97_BuilderClass b3 = new Assign_97_BuilderClass(156, "Nirman", "Nashik", 27, 12.50);
		Assign_97_BuilderClass b4 = new Assign_97_BuilderClass(342, "Swayam", "Satara", 18, 49.60);
		Assign_97_BuilderClass b5 = new Assign_97_BuilderClass(281, "Vishwanath", "Ahmedabad", 19, 78.50);
		Assign_97_BuilderClass b6 = new Assign_97_BuilderClass(648, "Skyline", "Jaipur", 12, 67.00);

		List<Assign_97_BuilderClass> builders = new ArrayList<Assign_97_BuilderClass>();
		builders.add(b1);
		builders.add(b2);
		builders.add(b3);
		builders.add(b4);
		builders.add(b5);
		builders.add(b6);

		System.out.println("Builders List sorted based on Name: \n");
		Collections.sort(builders, new Assign_97_BuilderNameComparator());
		System.out.println(builders + "\n");
		System.out.println("Builders List sorted based on Experience: \n");
		Collections.sort(builders, new Assign_97_BuilderExperienceComparator());
		System.out.println(builders + "\n");
		System.out.println("Builders List sorted in descending order of Revenue: \n");
		Collections.sort(builders, new Assign_97_BuilderRevenueComparator());
		System.out.println(builders + "\n");
	}
}