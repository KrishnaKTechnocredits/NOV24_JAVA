/*
 * Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits


 */


package mayur;

public class Assignment57 {
	
	int getMaxNum(int[] num) {	
		int temp =num[0];
		for (int i=0;i<num.length-1;i++) {
			if (num[i] > num[i+1] && num[i] >= temp) {
				temp=num[i];
			}else if(num[i+1] > num[i] && num[i+1] >= temp){
				temp=num[i+1];
			}
		}
		return temp;
	}
	
	String getLongestString(String[] arr) {
		int[] len = new int[arr.length];
		int temp = 0;
		String str ="";
		for (int i = 0 ; i< arr.length ; i++) {
			len[i] = arr[i].length();
			temp = getMaxNum(len);
			if (arr[i].length() == temp) {
				str = arr[i];
			}
		}		
		return str;
	}
	
	public static void main(String[] args) {
		Assignment57 obj = new Assignment57();
		String[] arr = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};
		System.out.println(obj.getLongestString(arr));
	}	
}
