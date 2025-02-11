package swapnil;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment105 {
	
	void getAnagram(String str1, String str2) {
		
		char[] Array1 = str1.toCharArray();
		char[] Array2 = str2.toCharArray();
		
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
		if(Arrays.equals(Array1, Array2)) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}
	public static void main(String[] args) {
		Assignment105 a = new Assignment105();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str1 = sc.nextLine().toLowerCase();
		System.out.println("Enter String 2:");
		String str2 = sc.nextLine().toLowerCase();
		a.getAnagram(str1, str2);
		sc.close();
	}
}
