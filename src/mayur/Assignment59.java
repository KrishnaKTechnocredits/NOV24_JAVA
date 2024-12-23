/*
 * Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne

 */

package mayur;

public class Assignment59 {
	
	int getSecondMaxNum(int[] num) {	
		int max =num[0];
		int secMax=num[0];
		for (int i=0; i <num.length-1 ; i++) {
			if (num[i] > num[i+1] && num[i] >= max) {
				max=num[i];
			}
			if(num[i+1] > num[i] && num[i+1] >= max){
				max=num[i+1];
			}
		}
		for (int i=0; i <num.length-1 ; i++) {
			if(num[i] < max && num[i] >= secMax) {
				secMax = num[i];
			}
			if(num[i+1] < max && num[i+1] >= secMax){
				secMax=num[i+1];
			}
		}
		
		return secMax;
	}
	
	void displaySecondLongestString(String[] arr) {
		int[] len = new int[arr.length];
		//int temp = 0;
		for (int i = 0 ; i< arr.length ; i++) {
			len[i] = arr[i].length();
		}
		//temp = getSecondMaxNum(len);
		for (int i = 0 ; i< arr.length ; i++) {
			if (arr[i].length() == getSecondMaxNum(len)) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment59 obj = new Assignment59();
		String[] arr = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		obj.displaySecondLongestString(arr);
	}
}
