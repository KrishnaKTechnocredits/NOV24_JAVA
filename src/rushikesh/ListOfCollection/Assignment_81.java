package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.List;

public class Assignment_81 {
	
	List<Integer> getListOfUniqueElement(int[] arr){
		List<Integer> listOfUniqueElement=new ArrayList<Integer>();
		for (int num: arr) {
			if (!listOfUniqueElement.contains(num)) {
				listOfUniqueElement.add(num);
			}
		}
		return listOfUniqueElement;
	}
	
	public static void main(String[] args) {
		Assignment_81 assignment_81=new Assignment_81();
		int[] arr= {10,44,55,22,44,11,77,88,99,11};
		List<Integer> output=assignment_81.getListOfUniqueElement(arr);
		System.out.println(output);
	}

}
