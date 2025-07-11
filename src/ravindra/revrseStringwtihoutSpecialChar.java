package ravindra;

import java.util.Arrays;

public class revrseStringwtihoutSpecialChar {

	public static void main(String[] args) {
		
		String s="ra$vi@nd%dra";
		char[] arr=s.toCharArray();
		int left=0;
		int right=s.length()-1;
		while(left < right) {
	
			char temp;
			if(Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			
			else if(!Character.isLetter(arr[left])){
				left++;
			}
			else{
				right--;
			}
		}
		
		String str = new String(arr);
	     System.out.println(str); // Output: Hello
	}
}
