//Assignment - 14 : 21st Nov'2024 [15 mins]
//
//On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 1 to 60
//Output : In the range 1 to 70, calculated sum is 150
//         In the range 1 to 70, 4 numbers are divisible by 3 and 5.

package harshada;

public class Divisibleby3and5 {
	int count=0;
	int sum=0;
	void divisibleBy3and5(int startRng, int endRng) {
		for(int index=startRng; index<=endRng; index++) {
			if(index%3==0 && index%5==0) {
				sum=sum+index;
				count++;
			}
		}
		System.out.println("In the range "+startRng+" to "+endRng+", calculated sum is "+sum);
		System.out.println("In the range "+startRng+" to "+endRng+", "+count+" numbers are divisible by 3 and 5");
	}
	
	public static void main(String[] args) {
		Divisibleby3and5 divisibleby3and5=new Divisibleby3and5();
		divisibleby3and5.divisibleBy3and5(1, 70);
	}
}
