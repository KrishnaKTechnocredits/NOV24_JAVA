/*
 * Assignment - 105 : 2st Feb'2025
Find anagram of below input :
input : Listen ---Silent
output : Given strings [Listen ---Silent] are anagram string

input : Techno -- chnott
output : Given strings [Techno -- chnott] are not angram string

Hint : Using Collections framework, using array sorting and comparing.

 */

package rohan;
import java.util.*;

public class Assignment_105 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input 1");
		String str = sc.next();
		String input = str.toLowerCase();
		System.out.println("Enter the input 2");
		String str1 = sc.next();
		String input1 = str.toLowerCase();
		
		if(str.length()!=str1.length()){
			System.out.println("Given strings are not angram");
		}
		Set<Object> str2  = new TreeSet<>();
		for(int i=0 ;i<str.length();i++) {
			char ch = input.charAt(i);
			str2.add(ch);
			//System.out.println(str2+"str2");
		}
		Set<Object> str3  = new TreeSet<>();
		for(int i=0 ;i<str.length();i++) {
			char ch = input1.charAt(i);
			str3.add(ch);
			//System.out.println(str3+"str3");
		}
		if(str2.equals(str3)) {
			System.out.println("Given strings "+str+" "+str1 +" are anagram string");
		}
		else {
			System.out.println("Given strings "+str+" "+str1 +" are not anagram string");
		}
	}
}
