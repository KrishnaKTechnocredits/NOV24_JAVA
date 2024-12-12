package deepali.basicDemo;

public class Assignment_16 {
	int sum=0;
	int avarage;
	int count = 0;
	void printSumAverage(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num % 5 == 0 && num % 7 == 0) {
				sum=sum+num;
				System.out.println("Sum of number which is divisible by 5 & 7 is : "+ num);
				count++;
				if(count==3) {
					break;
				}
			}
		}
		System.out.println("Sum of number which is divisible by 5 & 7 is : "+ sum);
		System.out.println("Avarage of the Sum : "+ sum/count);
		System.out.println("The count of number which is divisible by 5 & 7 is : "+ count);
	
	}
	
	public static void main(String[] args) {
		Assignment_16 assignment = new Assignment_16();
		assignment.printSumAverage(1,210);
	}

}
