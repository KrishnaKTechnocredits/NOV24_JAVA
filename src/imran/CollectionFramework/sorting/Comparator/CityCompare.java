package imran.CollectionFramework.sorting.Comparator;

import java.util.Comparator;

public class CityCompare implements Comparator <Builders> {

	@Override
	public int compare(Builders b1, Builders b2) {
		
		return b1.city.compareTo(b2.city);
	}

}
