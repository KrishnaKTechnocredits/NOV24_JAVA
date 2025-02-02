package harish.comparator;

import java.util.Comparator;

public class BuilderRevenueComparator implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		// sorting in descending order
		return Double.valueOf(o2.getBuilderRevenue()).compareTo(Double.valueOf(o1.getBuilderRevenue()));
	}
}