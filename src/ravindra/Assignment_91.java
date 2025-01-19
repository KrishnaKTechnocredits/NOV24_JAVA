package ravindra;

import java.util.Set;
import java.util.TreeSet;

public class Assignment_91 {
	public static void main(String[] args) {
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		System.out.println(returnUniqeEleInNaturalOrder(arr));
	}
	
	static Set<Integer> returnUniqeEleInNaturalOrder(Integer[] arr) {
		Set<Integer> list=new TreeSet<>();
		for(int number:arr) {
			list.add(number);
		}
		return list;
	}
}
