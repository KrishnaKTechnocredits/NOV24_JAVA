package nilam.CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;

//Return the unique list of numbers from given Array. [IMP]

public class Assignment_81 {
	static List<Integer> uniqueListOfNumbers(int[] numberList) {
		List<Integer> uniqueList=new ArrayList<Integer>();
		for(int index=0;index<numberList.length;index++) {
			int num=numberList[index];
			if(!uniqueList.contains(num)) {
				uniqueList.add(num);
			}
		}
		return uniqueList;	
	}
	
	
	public static void main(String[] args) {
		int[] numberList = {10,44,55,22,44,11,77,88,99,11};
		List<Integer> uniqueNumList=Assignment_81.uniqueListOfNumbers(numberList);
		System.out.println(uniqueNumList);
	}

}
