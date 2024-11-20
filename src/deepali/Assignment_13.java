package deepali;
/*1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
*/
public class Assignment_13 {
	
	void printNum(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num % 5 == 0 && num % 3 == 0) {
				System.out.println("Number is divisible by 5 and 3 :"+" "+num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_13 assignment = new Assignment_13();
		assignment.printNum(5,40);
	}
}
