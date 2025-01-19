/*Assignment - 81 : 12th Jan
Return the unique list of numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};


List<Integer> getUniqueNumberList(int[] input){
	List<Integer> listOfNumbers = new ArrayList<Integer>();
	
}

output : [10,44,55,22,11,77,88,99]

Hint : contains method of ArrayList.*/



package sindhu.ArrayList;
import java.util.*;

public class Assignment81 {
	
	public List<Integer> getUniqueNum(List<Integer> al){
		List<Integer> ListOfUniq = new ArrayList<Integer>();
		for(int i=0;i<al.size(); i++) {
			int num= al.get(i);
			if(al.indexOf(num)== al.lastIndexOf(num)) {
				ListOfUniq.add(al.get(i));
			}else if(al.indexOf(num)!= al.lastIndexOf(num) && i==al.indexOf(num)) {
				ListOfUniq.add(al.get(i));
			}
		}
		return ListOfUniq;
		
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,44,55,22,44,11,77,88,99,11};
		List<Integer> al = Arrays.asList(arr);
		Assignment81 assign81 = new Assignment81();
		List<Integer> outputList = assign81.getUniqueNum(al);
		System.out.println("output is: "+outputList);
	}

	
	
}
