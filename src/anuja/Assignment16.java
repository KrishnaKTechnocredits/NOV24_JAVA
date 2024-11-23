package anuja;
/*print sum and average of first 3 numbers which is divisible by 5 & 7*/
public class Assignment16 {
	//method to find 3 nums which are divisible by 5 and 7- input 1, 210.
	//print sum of all three
	//print avg of all three
	void printThreeNumDivisibleBy5And7WithSumAndAvg(int startNum , int lastNum) {
		int sum = 0;
		int count = 0;
		double avg = 0;
		//write a for loop to iterate
		System.out.println("Numbers devisible by 5 and 7 are as below \n ");
		for(;startNum<=lastNum;startNum++) {
			//write a if condition for logic
			if(startNum%5==0 && startNum%7==0) {
				System.out.println(startNum+"\n");
				sum = sum + startNum;
				count++;
				//add logic to store numbs under sum
				//logic to break the loop if 1st three nums we received
				if(count==3) {
					avg = sum / count;
					break;
				}
			}
		}
		System.out.println("------------------------------------------------------------------------ \n");
		System.out.println("Sum of all three numbers which are devisible by 5 and 7 is "+sum+" . \n ");
		System.out.println("Avg of all three numbers which are devisible by 5 and 7 is "+avg+" . \n");	
	}
	//write a main method and object to call print method.
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.printThreeNumDivisibleBy5And7WithSumAndAvg(1, 210);
	}
}
