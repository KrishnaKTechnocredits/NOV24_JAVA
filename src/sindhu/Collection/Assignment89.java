/*Remove all the duplicates from given array. 

Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
*/

package sindhu.Collection;

import java.util.*;

public class Assignment89 {
	public static void main(String[] args) {
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
		System.out.println("The input array is: "+Arrays.toString(arr));
		HashSet<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(arr));
		System.out.println("The output list with no duolicates: "+lhs);
	}
}
