/*"Assignment - 13 : 20th Nov'2024 [20 mins]

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30"
*/
package SheetalG;
public class Divisible5 {

	void printNum(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num % 5 == 0 && num % 3 == 0) {
				System.out.println("Number is divisible by 5 and 3 :"+" "+num);
			}
		}
	}

	public static void main(String[] args) {
		Divisible5 divisible5 = new Divisible5();
		divisible5.printNum(5,40);
	}
}