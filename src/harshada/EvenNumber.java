/**
 * Assignment 12 - Print all even numbers in a user defined range
 * Write only one program having the following methods.

1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.

Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14
 * 
 */

package harshada;

public class EvenNumber {
	
	void findEvenNumber(int startRng, int endRng) {
		for(;startRng<=endRng;startRng++) {
			if(startRng%2==0) {
				System.out.println(startRng);
			}
		}
	}
	
	public static void main(String[] args) {
		EvenNumber evenNumber=new EvenNumber();
		evenNumber.findEvenNumber(10, 15);
	}
}
