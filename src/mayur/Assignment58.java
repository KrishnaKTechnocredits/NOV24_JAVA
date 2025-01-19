/*
 * Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne

 */

package mayur;

public class Assignment58 {
	
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
	
	String getSecondLongestString(String[] arr) {
		int[] len = new int[arr.length];
		int temp = 0;
		String str ="";
		for (int i = 0 ; i< arr.length ; i++) {
			len[i] = arr[i].length();
			temp = getSecondMaxNum(len);
			if (arr[i].length() == temp) {
				str = arr[i];
			}
		}		
		return str;
	}
	
	public static void main(String[] args) {
		Assignment58 obj = new Assignment58();
		String[] arr = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println(obj.getSecondLongestString(arr));
	}
}
