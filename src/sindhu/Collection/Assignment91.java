/*Remove all duplicates and return the set having all number in natural/ascending order. 

Integer[] arr = {66,33,44,12,99,22,33,33,66};
output : [12,22,33,44,66,99] */


package sindhu.Collection;
import java.util.*;

public class Assignment91 {
	public static void main(String[] args) {
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		System.out.println("The input array is: "+Arrays.toString(arr));
		Set<Integer> tst = new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println("The natural order list with out duplicate records: "+tst);
	}
}
