package nilam.CollectionFrameWork.Set;
import java.util.HashSet;
import java.util.Set;

//From given array, return all duplicate elements.
public class Assignment_88 {

	static Set<Integer> getDuplicateElements(int[] arr) {
		Set<Integer> output = new HashSet<Integer>();
		Set<Integer> duplicateElements = new HashSet<Integer>();
		for (int num : arr) {
			if (!output.add(num)) {
				duplicateElements.add(num);
			}
		}
		return duplicateElements;
	}

	public static void main(String[] args) {
		int[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
		Set<Integer> duplicateElementsList = getDuplicateElements(arr);
		System.out.println(duplicateElementsList);
	}

}
