package kishor;

import java.util.Comparator;

public class Assignment97_Revenue implements Comparator<Assignment97_Builder>{

	public int compare(Assignment97_Builder b1,Assignment97_Builder b2) {
		return b1.revenue-b2.revenue;
	}

	
}
