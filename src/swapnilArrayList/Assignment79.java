package swapnilArrayList;

import java.util.Arrays;
import java.util.List;


public class Assignment79 {
	
	void getDuplicateNum(Integer[] arr) {
		List<Integer> al = Arrays.asList(arr);
		
		for(int i=0;i<al.size();i++) {
			int Num = al.get(i);
			
			int index = al.indexOf(Num);
			int lastindex = al.lastIndexOf(Num);
			
			if(index!=lastindex && i==index) {
				System.out.println(Num+" is duplicate, at index "+index+" and "+lastindex);
				
			}
		}	
	}
	public static void main(String[] args) {
		Integer[] arr = {10, 99, 10, 10, 77, 55, 46, 99};
		Assignment79 A = new Assignment79();
		A.getDuplicateNum(arr);
	}
}
