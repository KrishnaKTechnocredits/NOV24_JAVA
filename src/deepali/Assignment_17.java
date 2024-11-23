package deepali;
/*On user defined range print last 5 numbers which is divisible by 5.
*/
public class Assignment_17 {
	int count=0;
	void printNumber(int startRange, int endRange){
		for(int num=endRange; num>=startRange; num--){
			if(num % 5 == 0 && num % 3 == 0) {
				System.out.println("The number which is divisible by 5  is : "+ num);
				count++;
				if(count==5) {
					break;
				}
			}
		}
		System.out.println("The count of number which is divisible by 5  is : "+ count);
	}
	
	public static void main(String[] args) {
		Assignment_17 assignment = new Assignment_17();
		assignment.printNumber(10,500);
	}
}
