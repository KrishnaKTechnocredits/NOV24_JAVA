/*Find first Unique number from given list. 

input : [66,12,69,12,77,66,69,5,8,14]
output : First unique number is 77*/

package sindhu.ArrayList;

import java.util.*;

public class Challenge2 {
	public static void main(String[] args) {
		Challenge2 chlng2 = new Challenge2();
		ArrayList<Integer> inpLs = new ArrayList<Integer>(Arrays.asList(66,12,69,12,77,66,69,5,8,14));
		System.out.println("The input array list is: "+inpLs);
		
		int firstUniqNum = chlng2.getFirstUniqueNum(inpLs);
		System.out.println("The first Unique number in the list is: "+firstUniqNum);
	}
	
	public int getFirstUniqueNum(ArrayList<Integer> inpLs) {
		
		for(int i=0;i<inpLs.size();i++) {
			int num = inpLs.get(i);
			if(inpLs.indexOf(num)==inpLs.lastIndexOf(num)) {
				return num;
			}
		}
		return -1;
	}
}
