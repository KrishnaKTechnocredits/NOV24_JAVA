/*Challenge - 1 : 16th Jan'2025
Find out the 3rd largest number from given list.

Input : [55,44,55,12,99,99,36,24,8,23]
output : 44
 */

package sindhu.ArrayList;

import java.util.*;

public class challenge1 {
	public static void main(String[] args) {
		ArrayList<Integer> inpLst = new ArrayList<Integer>(Arrays.asList(55,44,55,12,99,99,36,24,8,23));
		System.out.println("The input list is: "+inpLst);
		
		Set<Integer> tst = new TreeSet<Integer>(inpLst);
		System.out.println("The unique and natural set of records: "+tst);
		
		ArrayList<Integer> outLst = new ArrayList<Integer>(tst);
		
		System.out.println("The 3rd largest number from given list is: "+outLst.get(outLst.size()-3));
	}	
}
