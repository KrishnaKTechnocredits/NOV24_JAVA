//Assignment - 18 : 23rd Nov'2024 [20 mins]
//On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.
//
//int getLastDivNumber(int startIndex, int endIndex){
//
//}
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 498
//Output : 495 is the last number which is div by 5 in the given range.
package harshada;

public class ReturnLastNumBy5 {
	int Num;
	int divisibleBy5(int startRng, int endRng) {
		for(int index=endRng; endRng>=startRng; index--) {
			if(index%5==0) {
				Num=index;
				break;
			}	
		}
		return Num;
	}
	public static void main(String[] args) {
		ReturnLastNumBy5 returnLastNumBy5=new ReturnLastNumBy5();
		int Num=returnLastNumBy5.divisibleBy5(1, 498);
		System.out.println(Num+" is the last number which is div by 5 in the given range");
	}
}
