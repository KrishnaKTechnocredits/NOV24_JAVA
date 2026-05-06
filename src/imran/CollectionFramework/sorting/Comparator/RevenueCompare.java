package imran.CollectionFramework.sorting.Comparator;

import java.util.Comparator;

public class RevenueCompare implements Comparator<Builders>{

	public int compare(Builders b1 , Builders b2)
	{
		return b1.revenue - b2.revenue;	
	}
}
