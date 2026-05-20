package amruta.CollectionPrograms;

import java.util.Comparator;

public class Assign_97_BuilderRevenueComparator implements Comparator<Assign_97_BuilderClass> {
	
	@Override
	public int compare(Assign_97_BuilderClass o1, Assign_97_BuilderClass o2) {
		// sorting in descending order
		return Double.valueOf(o2.getBuilderRevenue()).compareTo(Double.valueOf(o1.getBuilderRevenue()));
	}
}