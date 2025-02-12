package amruta.CollectionPrograms;

import java.util.Comparator;

public class Assign_97_BuilderNameComparator implements Comparator<Assign_97_BuilderClass> {
	
	@Override
	public int compare(Assign_97_BuilderClass o1, Assign_97_BuilderClass o2) {
		return o1.getBuilderName().compareTo(o2.getBuilderName());
	}
}