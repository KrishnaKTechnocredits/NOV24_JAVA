package imran.CollectionFramework.sorting.Comparator;

import java.util.Comparator;

public class ExperienceCompare implements Comparator<Builders> {

	@Override
	public int compare(Builders b1, Builders b2) {
		
		return b1.experience- b2.experience;
	}
	

}
