/*From given array, return all duplicate elements.

int[] arr = {33,22,44,33,12,15,16,22};
output : [33,22]*/

package sindhu.Collection;
import java.util.*;

public class Assignment88 {
	public static void main(String[] args) {
		Assignment88 a88 = new Assignment88();
		int[] arr = {33,22,44,33,12,15,16,22};
		System.out.println("The input array is: "+Arrays.toString(arr));
				
		HashSet<Integer> outSet = a88.getDuplicateRec(arr);
		System.out.println("the duplicate records are: "+outSet);
	}
	
	public HashSet<Integer> getDuplicateRec(int[] arr){
		HashSet<Integer> inSet = new HashSet<Integer>();
		HashSet<Integer> outSet = new HashSet<Integer>();
		for(int num : arr) {
			if(!inSet.add(num)) {
				outSet.add(num);
			}
		}
		return outSet;
	}
}
