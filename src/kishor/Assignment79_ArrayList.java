package kishor;
//Find out all the duplicate elements from given arrayList.
//input : [10, 99, 10, 10, 77, 55, 46, 99]'
//output : 10 is duplicate, at index 0 and 3 
//         99 is duplicate , at index 1 and 7.

import java.util.ArrayList;

public class Assignment79_ArrayList {
	
	void DisplayDuplicateItems(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			int num = list.get(i);
			int firstIndex= list.indexOf(num);
			int lastIndex = list.lastIndexOf(num);
			if(firstIndex!=lastIndex && i==firstIndex) {
				System.out.println(num+" is duplicate, at index "+firstIndex+ " and "+lastIndex);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(99); list.add(10);list.add(10);list.add(77);
		list.add(55);list.add(46);list.add(99);
		Assignment79_ArrayList assignment79 = new Assignment79_ArrayList();
		assignment79.DisplayDuplicateItems(list);
	}
}
