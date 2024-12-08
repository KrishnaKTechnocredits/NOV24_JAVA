package deepali.basicDemo;
/*On user defined range print first 3 numbers which is divisible by 3 & 4
*/
public class Assignment_15 {
	int count=0;
	int num;
	void printNumber(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num % 3 == 0 && num % 4 == 0) {
				count++;
				System.out.println("The number which is divisible by 3 & 4 is : "+ num);
				if(count == 3) {
					break;
				}
			}
		}
	
		System.out.println("The count of number which is divisible by 3 & 4 is : "+ count);
	}
	
	public static void main(String[] args) {
		Assignment_15 assignment = new Assignment_15();
		assignment.printNumber(10,500);
	}
}
