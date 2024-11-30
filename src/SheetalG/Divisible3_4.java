/*Assignment - 15 : 22nd Nov'2024 [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36*/

package SheetalG;

public class Divisible3_4 {
	static int count;

	void div(int startRange,int endRange) {
		System.out.println("First 3 numbers divisible by 3 and 4 are :");
		for(int num =startRange; num <=endRange; num++) {
			if (num%3==0 && num%4==0) {
				System.out.println(num);
				count++;
					if (count==3) {
					break;
					}
			}	
		}
	}
	public static void main(String[] args) {
		Divisible3_4 divisible3_4 = new Divisible3_4();
		divisible3_4.div(1, 500);
	}
}