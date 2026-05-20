package amruta.CollectionPrograms;

import java.util.Comparator;

public class Assign_97_BuilderExperienceComparator implements Comparator<Assign_97_BuilderClass> {

	@Override
	public int compare(Assign_97_BuilderClass o1, Assign_97_BuilderClass o2) {
		return Double.valueOf(o1.getBuilderExperience()).compareTo(Double.valueOf(o2.getBuilderExperience()));
	}
}