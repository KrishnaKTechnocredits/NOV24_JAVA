//Assignment - 17 : 22nd Nov'2024 [20 mins]
//On user defined range print last 5 numbers which is divisible by 5.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 500
//Output : Last 5 numbers divisible by 5 is :
//500
//495
//490
//485
//480

package harshada;

public class Last5DivisibleBy5 {
	int count;
	void findDivisibleBy5(int startRng, int endRng) {
		System.out.println("Last 5 numbers divisible by 5 is :");
		for(int index=endRng;endRng>=startRng; index--) {
			if(index%5==0) {
				System.out.println(index);
				count++;
				if(count==5)
					break;
			}
		}
	}
	public static void main(String[] args) {
		Last5DivisibleBy5 last5DivisibleBy5=new Last5DivisibleBy5();
		last5DivisibleBy5.findDivisibleBy5(10, 500);
	}
}
