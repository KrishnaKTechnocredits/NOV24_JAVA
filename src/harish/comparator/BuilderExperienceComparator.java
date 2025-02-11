package harish.comparator;

import java.util.Comparator;

public class BuilderExperienceComparator implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		return Double.valueOf(o1.getBuilderExperience()).compareTo(Double.valueOf(o2.getBuilderExperience()));
	}
}