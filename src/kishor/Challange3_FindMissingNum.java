package kishor;
//Find all the missing numbers between 1 to 10 from given List.
//
//input : [9,7,6,2,1,5,3,10]
//output : [4,8]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challange3_FindMissingNum {
	
	List<Integer> getMissingNum(Integer[] arr){
		List<Integer> list = Arrays.asList(arr);
		List<Integer> misingNum= new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			int num=i;
			if(!list.contains(num)) {
				misingNum.add(num);
			}
		}
		return misingNum;
	}
	
	public static void main(String[] args) {
		Integer[] arr= {9,7,6,2,1,5,3,10};
		Challange3_FindMissingNum challange3 = new Challange3_FindMissingNum();
		List<Integer> num=challange3.getMissingNum(arr);
		System.out.println(num);
	}
}
