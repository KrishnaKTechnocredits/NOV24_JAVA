package imran.CollectionFramework.sorting.Comparator;

import java.util.Comparator;

public class Emp_ExperienceCompare implements Comparator <Employees>{

	@Override
	public int compare(Employees E1, Employees E2) {
		
		return E1.experience -E2.experience;
	}

}
