package vrushali.collection;

//Assignment - 85: 14th Jan
//
//Remove duplicate from 2 list, and return all the unique elements from both list. 
//
//input : [10, 20, 30, 40]
//        [20,30,60,70,80,90,100,101,44,55,66,77]
//output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]	
//imp
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateAndReturnUiqueListFrom2List85 {
	List<Integer> returnUniqueList(List<Integer> list1, List<Integer> list2) {
		list2.removeAll(list1);
		list1.addAll(list2);
		return list1;
	}

	public static void main(String[] args) {
		RemoveDuplicateAndReturnUiqueListFrom2List85 rv = new RemoveDuplicateAndReturnUiqueListFrom2List85();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list2.add(20);
		list2.add(30);
		list2.add(60);
		list2.add(70);
		list2.add(80);
		list2.add(90);
		list2.add(100);
		list2.add(101);
		list2.add(44);
		list2.add(55);
		list2.add(66);
		list2.add(77);

		System.out.println(list1);
		System.out.println(list2);

		List<Integer> list3 = rv.returnUniqueList(list1, list2);
		System.out.println(list3);

	}
}
