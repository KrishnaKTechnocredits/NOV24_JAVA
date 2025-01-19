/*Find all the missing numbers between 1 to 10 from given List.

input : [9,7,6,2,1,5,3,10]
output : [4,8]*/

package sindhu.ArrayList;

import java.util.*;

public class Challenge3 {
	public static void main(String[] args) {
		Challenge3 chlnng3 = new Challenge3();
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(9,7,6,2,1,5,3,10));
		System.out.println("The input list is: "+al);
		
		TreeSet<Integer> tst = new TreeSet<Integer>(al);
		System.out.println("The list in natural order: "+tst);
		
		List<Integer> outMis= chlnng3.getMissingNumbers(tst);
		System.out.println("The missing numbers from the input list are: "+outMis);
	}
	
	public List<Integer> getMissingNumbers(TreeSet<Integer> tst){
		ArrayList<Integer> inpLs = new ArrayList<Integer>(tst);
		ArrayList<Integer> outLs = new ArrayList<Integer>();
		for(int i=0; i<inpLs.size()-1; i++) {
			int num1 = inpLs.get(i); //3
			int num2 = inpLs.get(i+1); //5
			//[1,2,3,5,6,7,9,10]
			if(num2-num1==2) {
				outLs.add(num1+1);
			}
		}
		return outLs;
	}
}
