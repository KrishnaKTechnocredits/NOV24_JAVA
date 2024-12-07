/*Assignment - 13 : 20th Nov'2024 [10 mins]

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30
*/

package pramod;
class Assignment13 {
	
	void printDivisibleBy(int startRange, int endRange) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int index = startRange; index <= endRange; index++) {
			if(index%5==0 && index%3==0) {
				System.out.println(index);
			}
		}
	}	
	
	public static void main(String[] args) {
		Assignment13 divisible = new Assignment13();
		divisible.printDivisibleBy(5,40);
	}
}