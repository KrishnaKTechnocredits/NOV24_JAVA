/*
 * Assignment - 104 : 2st Feb'2025
Find armstrome number of below input :
Input -153
output : 153 is an armstrome number

input : 123 
output : 123 is not an armstrome number
 
Hint : ( last number *3)-à sum
Sum=Sum+ (second num*3)
Sum=Sum +(first num*3)
run till num become 0
 */

package rohan;

import java.util.Scanner;

public class Assignment_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number::");
		String str = sc.next();
		int l = str.length();
		int num = Integer.parseInt(str);
		int originalnum = num;
		//System.out.println("num is :"+num);
		int sum = 0;
		while(num != 0) {
			int digit = num%10;
			sum = sum +(int) Math.pow(digit,l);
			num /=10;
		}
		//System.out.println("sum is :"+sum);
		//if(originalnum==sum) {
		//	System.out.println("Given num is Aremstrome");
		//}else {
		//	System.out.println("Given num is not Aremstrome");
		//}
		String result = (originalnum == sum) ? "Given num is Aremstrome" :"Given num is not Aremstrome";
		System.out.println(result);
	}

}
