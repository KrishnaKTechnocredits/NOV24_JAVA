/*
1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
*/
package ajay;

public class Assignment13 {
	
	void divisibleby5(int startindex, int endIndex) {
		System.out.println("Numbers divisible by 5 are: ");
		for(int i=startindex;i<=endIndex;i++) {
		if(i%5==0) {
			System.out.println(i);
			}
		}
	}
		void divisibleby3(int startindex,int endIndex) {
			System.out.println("------------------------------------");
			System.out.println("Numbers divisible by 3 are: ");
		for(int x=startindex;x<=endIndex;x++) {
			if(x%3==0) {
			System.out.println(x);
			}
		}
	}
public static void main(String[] args) {
		Assignment13 assignment13=new Assignment13();
		assignment13.divisibleby5(10,20);
		assignment13.divisibleby3(10,20);
		
	}

}
