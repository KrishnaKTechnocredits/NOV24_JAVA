package rushikesh.Programming_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {

	void printFiirstUniqNumberFromList(Integer[] arr) {
		List<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(listOfNum);
		for (int index = 0; index < listOfNum.size(); index++) {
			int num = listOfNum.get(index);
			int currentIndex = listOfNum.indexOf(num);
			int lastIndex = listOfNum.lastIndexOf(num);
			if (currentIndex == lastIndex) {
				System.out.println("Firts unique Num from List is " + num);
				break;
			}

		}
	}

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		Integer[] arr = { 66, 12, 69, 12, 77, 66, 69, 5, 8, 14 };
		test5.printFiirstUniqNumberFromList(arr);

	}

}
