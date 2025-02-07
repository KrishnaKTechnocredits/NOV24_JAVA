package nilam.CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;

/*Remove duplicate from 2 list, and return all the unique elements from both list. 
input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
*/
public class Assignment_85 {
	
	static List<Integer> getUniqueList(List<Integer> list1,List<Integer>list2){
		list2.removeAll(list1);
		list1.addAll(list2);
		return list1;		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);		
		System.out.println("List1: " + list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
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
		System.out.println("List2: " + list2);
		
		List<Integer> uniqueElementsList=getUniqueList(list1,list2);
		System.out.println("Unique Elements from list1 and list2: " + uniqueElementsList);
		
	}

}
