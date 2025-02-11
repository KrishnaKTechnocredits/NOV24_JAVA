package imran.CollectionFramework.sorting.Comparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Builders>{

	@Override
	public int compare(Builders b1, Builders b2) {
		
		return b1.name.compareTo(b2.name);
	}

}
