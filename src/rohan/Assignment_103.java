/*
 * Assignment - 103 : 2st Feb'2025
Find palindrome of below input :
Input : naman ,1221
output : naman is a pallindrom string
         1221 is a pallindromnumber
		 techno is not a pallindrom string
         1211 is not a pallindrom number
		 
Hint : naman reverse is again naman ( name ,number if we reverse still it comes same )
 */

package rohan;
import java.util.*;
public class Assignment_103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		sc.close();
		
		String str3 = str.toLowerCase();
		//System.out.println(str3);
		StringBuffer str1 = new StringBuffer(str3);
		String rev = str1.reverse().toString();
		//System.out.println(rev);
		if(rev.equals(str3)) {
			System.out.println( str+" is a pallindrom string");
		}else {
			System.out.println( str+" is a not pallindrom string");
		}
		
	}

}
