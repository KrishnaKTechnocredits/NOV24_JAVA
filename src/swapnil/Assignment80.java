package swapnil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Assignment80 {
	
	void getDuplicateNum(Integer[] arr) {
		List<Integer> al = Arrays.asList(arr);
		
		for(int i=0;i<al.size();i++) {
			int Num = al.get(i);
			
			int index = al.indexOf(Num);
			int lastindex = al.lastIndexOf(Num);
			
			if(index!=lastindex && i==index) {
				List<Integer> allIndex = getAlOfIndex(al,Num);
				System.out.println(Num+" is duplicate at index "+allIndex);
				}
				
			}
		}	
	List<Integer> getAlOfIndex(List<Integer> al,int Num){
		ArrayList<Integer> allIndex = new ArrayList<Integer>();
		for(int i=0;i<al.size();i++) {
			if(Num==al.get(i)) {
				allIndex.add(i);
			}
		}
		
		return allIndex;
	}
	
	
	public static void main(String[] args) {
		Integer[] arr = {10, 99, 10, 10, 77, 55, 46, 99,99};
		Assignment80 A = new Assignment80();
		A.getDuplicateNum(arr);
	}
}


