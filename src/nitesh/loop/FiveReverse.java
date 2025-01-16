/*Assignment - 17 : 22nd Nov'2024 [20 mins]
On user defined range print last 5 numbers which is divisible by 5.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480
 */

package nitesh.loop;

public class FiveReverse {
	int count;

	void divisibleByFive(int startrange,int endrange) {
		for(;endrange>=startrange;endrange--) {
			if(endrange%5==0) {
				System.out.println("Last 5 numbers divisible by 5 is :"+" "+endrange);
				count++;
				if(count==5) {
					break;
				} 
			}
		}
	}
	public static void main(String[] args) {
		FiveReverse fivereverse =new FiveReverse();
		fivereverse.divisibleByFive(10, 500);
	}
}