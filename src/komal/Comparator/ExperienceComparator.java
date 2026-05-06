package komal.Comparator;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		// TODO Auto-generated method stub
		return o1.exp - o2.exp;
	}
}
