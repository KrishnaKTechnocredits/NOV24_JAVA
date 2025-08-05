package nilam.CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;

//Return the list of duplicate numbers from given Array. [IMP]

public class Assignment_82 {
	
	static List<Integer> getListFromArray(int[] numList) {
		List<Integer> numbersList = new ArrayList<Integer>();
		for(int i=0;i<numList.length;i++) {
			numbersList.add(numList[i]);
		}
		return numbersList;
	}

	static List<Integer> getDuplicateNumList(int[] numList) {
		
		List<Integer> numbersList = getListFromArray(numList);
		List<Integer> duplicateNumbersList=new ArrayList<Integer>();
;		for (int index = 0; index < numbersList.size(); index++) {
			int num = numbersList.get(index);
			if (numbersList.indexOf(num)!=numbersList.lastIndexOf(num)) {
				if(!duplicateNumbersList.contains(num)){
					duplicateNumbersList.add(num);
				}
			}
		}
		return duplicateNumbersList;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		List<Integer> duplicateNumbersList = Assignment_82.getDuplicateNumList(arr);
		System.out.println(duplicateNumbersList);
	}
}
