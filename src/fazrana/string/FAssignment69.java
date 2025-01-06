//Assignment - 69 : 5th Jan'2025 [IMP]
//Print frequency of each word from given String.
//
//String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
//
//output : 
//Hi -> 4
//Hello -> 1
//Techno -> 2
//Credits -> 1

package fazrana.string;

import java.util.Arrays;

public class FAssignment69 {
	void getFrequency(String str) {
		String[] array= str.split(" ");
		for (int i=0;i<array.length;i++) {
			String val=array[i];
			int count=0;
			if (array[i]!="") {
				for (int j=0;j<array.length;j++) {
					if (val.equalsIgnoreCase(array[j])) {
						array[j]="";
						count++;
					}
				}
				System.out.println(val+"->>"+ count);
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		System.out.println("Input: "+ str);
		FAssignment69 fassignment69=new FAssignment69();
		fassignment69.getFrequency(str);
	}
}
