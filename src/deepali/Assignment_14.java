package deepali;
/*1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
*/
public class Assignment_14 {
	int sum=0;
	int count=0;
	void printNumber(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num % 5 == 0 && num % 3 == 0) {
				sum=sum+num;
				count++;
			}
		}
		System.out.println("Sum of the number which is divisible by 5 & 3 is : "+ sum);
		System.out.println("The count of number which is divisible by 5 & 3 is : "+ count);
	}
	
	public static void main(String[] args) {
		Assignment_14 assignment = new Assignment_14();
		assignment.printNumber(1,70);
	}
}
