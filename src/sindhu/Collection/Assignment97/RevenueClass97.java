package sindhu.Collection.Assignment97;

import java.util.*;

public class RevenueClass97 implements Comparator<Emp> {
	@Override
	public int compare(Emp o1, Emp o2) {
		return Double.compare(o1.revenue,o2.revenue);
	}
}	
