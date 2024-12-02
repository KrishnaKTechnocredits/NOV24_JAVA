/* Assignment - 15 : 22nd Nov'2024 [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
*/
package nitesh;

public class PrintFirstThreeNum {
	int countindex;

	void divisibleNumbers(int startrange,int endrange) {
		for (int index = startrange;index<endrange;index++) {
			if (index%3==0 && index%4 ==0) {
				System.out.println("First 3 numbers divisible by 3 and 4 is :"+" "+index);
				countindex++;
					if (countindex== 3) {
					break;
				}
			}	
		}	
	}
	public static void main(String[] args) {
		PrintFirstThreeNum printfirstthreenum = new PrintFirstThreeNum();
		printfirstthreenum.divisibleNumbers(10, 500);
	}
}
