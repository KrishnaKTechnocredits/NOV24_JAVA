package harish.comparator;

import java.util.Comparator;

public class BuilderNameComparator implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		return o1.getBuilderName().compareTo(o2.getBuilderName());
	}
}
