package kishor;
//Find out all the duplicate elements from given arrayList and print them with their index.
//
//input : [10, 99, 10, 10, 77, 55, 46, 99,99]
//output : 10 is duplicate, at index [0, 2,3] 
//         99 is duplicate , at index [1,7,8]

import java.util.ArrayList;
import java.util.List;

public class Assignment80_ArrayList {
	
	List<Integer> getDuplicateElement(ArrayList<Integer> list, int num){
		List<Integer> duplicate = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==num) {
				duplicate.add(i);
			}
		}
		return duplicate;
	}
	
	void displayAllDuplicateElement(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			int num= list.get(i);
			if(list.indexOf(num)!=list.lastIndexOf(num)&& i==list.indexOf(num)) {
				List<Integer> ans=getDuplicateElement(list,num);
				System.out.println(num+" is duplicate, at index "+ ans);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(99); list.add(10);list.add(10);list.add(77);
		list.add(55);list.add(46);list.add(99);list.add(99);
		Assignment80_ArrayList assignment80 = new Assignment80_ArrayList();
		assignment80.displayAllDuplicateElement(list);
	}
}
