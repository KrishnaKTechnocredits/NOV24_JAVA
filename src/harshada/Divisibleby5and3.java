//Assignment - 13 : 20th Nov'2024 [20 mins]
//
//1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 5 to 40
//Output : Divisible by 5 & 3, numbers are:
//15
//30

package harshada;

public class Divisibleby5and3 {
	
	void divisibleBy5and3(int startRng, int endRng) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(;startRng<=endRng;startRng++) {
			if(startRng%5==0&&startRng%3==0) {
				System.out.println(startRng);
			}
		}
	}
	
	public static void main(String[] args) {
		Divisibleby5and3 divisibleby5and3=new Divisibleby5and3();
		divisibleby5and3.divisibleBy5and3(5,40);
	}
}
