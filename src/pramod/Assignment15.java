/*Assignment - 15 : 22nd Nov'2024 [10 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
*/

package pramod;

class Assignment15 {
	
	void printThreeNumbersDivBy(int startRange, int endRange) {
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		int count=0;
		for(int index = startRange; index <= endRange; index++) {
			if(index%3 == 0 && index%4 == 0) {
				System.out.println(index);
				count++;
			}
			if(count == 3){
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15 threenumbers = new Assignment15();
		threenumbers.printThreeNumbersDivBy(10,500);
	}
}