package deepali;
/*Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
*/
public class Assignment_12 {
	
	void printEvenNum(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num%2==0) {
				System.out.println("Even number :"+" "+num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment_12 assignment = new Assignment_12();
		assignment.printEvenNum(10,15);
	}
}
