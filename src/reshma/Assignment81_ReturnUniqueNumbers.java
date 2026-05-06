package reshma;
/* Return the unique list of numbers from given Array. [IMP]
  Input : int[] arr = {10,44,55,22,44,11,77,88,99,11};
  Output : [10,44,55,22,11,77,88,99]
  Hint : contains method of ArrayList. */

import java.util.ArrayList;
import java.util.List;

public class Assignment81_ReturnUniqueNumbers {
	List<Integer> getUniqueNumber(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Assignment81_ReturnUniqueNumbers a81 = new Assignment81_ReturnUniqueNumbers();
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };		
		List<Integer> ans = a81.getUniqueNumber(arr);
		System.out.println("output: " + ans);
		}
}
