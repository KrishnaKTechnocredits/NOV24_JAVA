/* Return the list of duplicate numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
output : [44, 11] */



package sindhu.ArrayList;
import java.util.*;

public class Assignment82 {
	
	List<Integer> getDuplicateNum(List<Integer> inList){
		List<Integer> ListOfDups = new ArrayList<Integer>();
		for(int i=0;i<inList.size(); i++) {
			int num = inList.get(i);
			if(inList.indexOf(num)!= inList.lastIndexOf(num) && i == inList.indexOf(num)) {
				ListOfDups.add(num);
			}
		}
		return ListOfDups;
		
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,44,55,22,44,11,77,88,99,11};
		Assignment82 assign82 = new Assignment82();
		List<Integer> inputList = Arrays.asList(arr);
		List<Integer> outputList = assign82.getDuplicateNum(inputList);
		System.out.println("output is: "+outputList);
	}
}
