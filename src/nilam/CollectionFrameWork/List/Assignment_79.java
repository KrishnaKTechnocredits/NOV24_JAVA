package nilam.CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;
//Find out all the duplicate elements from given arrayList.

public class Assignment_79 {

	static void getDuplicateNum(List<Integer> numbersList) {
		for (int index = 0; index < numbersList.size(); index++) {
			int num = numbersList.get(index);
			if (numbersList.indexOf(num) != numbersList.lastIndexOf(num) && numbersList.indexOf(num) == index) {
				System.out.println(num + " is duplicate at index " + numbersList.indexOf(num) + " and "
						+ numbersList.lastIndexOf(num));
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(99);
		numbersList.add(10);
		numbersList.add(10);
		numbersList.add(77);
		numbersList.add(55);
		numbersList.add(46);
		numbersList.add(99);
		System.out.println(numbersList);
		Assignment_79.getDuplicateNum(numbersList);
	}
}
