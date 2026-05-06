/*Print frequency of each word from given String.
	
	String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
	
	output : 
	Hi -> 4
	Hello -> 1
	Techno -> 2
	Credits -> 1*/

package sindhu.Array;
import java.util.Arrays;

public class Assignment69 {
	
	public void getCountOfSameString(String str) {
		String[] strArr = str.split(" ");
		System.out.println("Input String to array: "+Arrays.toString(strArr));
		System.out.println("");
		System.out.println("Output is: ");
		for(int i=0;i<strArr.length;i++) {
			String firstWord = strArr[i];
			int count = 0;
			if(!firstWord.equals("")) {
				for(int j=0;j<strArr.length;j++) {
					if(firstWord.equals(strArr[j])) {
						count++;
						strArr[j] = "";
					}
					//System.out.println(strArr[j]);
				}
				System.out.println(firstWord+"->"+count);
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		Assignment69 assign69 = new Assignment69();
		assign69.getCountOfSameString(str);
	}
}

