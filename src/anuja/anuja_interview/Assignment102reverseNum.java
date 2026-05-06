package anuja.anuja_interview;

import java.util.Scanner;

/* Reverse a Number Without Using Strings */
public class Assignment102reverseNum {

    public static void main(String[] args) {
        Assignment102reverseNum assignment102reverseNum = new Assignment102reverseNum();
        
        System.out.println("Please enter a valid number to be reversed");
        
        // Creating Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Reading integer input
        
        System.out.println("Input is: " + num + "\n");
        
        assignment102reverseNum.reverseNum(num);
        assignment102reverseNum.useStringBuidler(num);
        assignment102reverseNum.reverseNumasString(num);
    }

    // Method to reverse a number without converting it to a string
    private void reverseNum(int num) {
        int reverseNum = 0; // Variable to store reversed number
        
        // Loop to reverse the number
        while (num != 0) {
            int digit = num % 10; // Extracting the last digit
            reverseNum = reverseNum * 10 + digit; // Appending last digit to reversed number
            num = num / 10; // Removing the last digit from the original number
        }
        
        // Printing the reversed number
        System.out.println("Output without using string: " + reverseNum + "\n");
    }
    
    private void useStringBuidler(int num) {
    	StringBuilder reverse = new StringBuilder();
    	while(num>0) {
    		int digit = num%10;
    		reverse.append(digit);
    		num = num/10;
    	}
    	//not 0 will not get removed and it will be there as we are using strnig reverse.
    	System.out.println("Reversed num using StringBuilder " +reverse+"\n");
    }
    
    private void reverseNumasString(int num) {
        String reversed = ""; // Initialize an empty string to store the reversed number

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed.concat(String.valueOf(digit)); // Append digit to string using concat123
           
            num /= 10; // Remove the last digit
        }

        // Printing the reversed number as a string to preserve leading zeros
        System.out.println("Reverse input num using string class concat method : " + reversed + "\n");
    }

}
/*
 * === Quick Cheat Sheet ===
 * 1. Extract last digit: num % 10
 * 2. Remove last digit: num /= 10
 * 3. Reverse number:
 *    - Without string: reverseNum = reverseNum * 10 + digit
 *    - Using StringBuilder: append(digit)
 *    - Using String: concat(String.valueOf(digit))
 * 4. Edge Cases:
 *    - Single-digit numbers
 *    - Trailing zeros (handled in String approach)
 *    - Negative numbers (need additional handling)
 * 5. Time Complexity: O(log N) (since number is divided by 10 in each iteration)
 */