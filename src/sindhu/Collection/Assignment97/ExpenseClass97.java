package sindhu.Collection.Assignment97;

import java.util.*;

public class ExpenseClass97 implements Comparator<Emp> {
	public int compare(Emp o1, Emp o2) {
		return Integer.compare(o1.exp,o2.exp);
	}
}
