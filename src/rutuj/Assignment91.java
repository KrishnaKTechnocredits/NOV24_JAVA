package rutuj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Assignment91 {

	static Set<Integer> uniqueno(Integer[] arr) {
		Set<Integer> no = new TreeSet<Integer>(Arrays.asList(arr));
		// System.out.println(no);

		return no;
	}

	public static void main(String[] args) {

		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		Set<Integer> aa = Assignment91.uniqueno(arr);
		System.out.println(aa);
	}
}
