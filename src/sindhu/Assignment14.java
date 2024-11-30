package sindhu;

public class Assignment14 {
	int temp=0;
	int sum=0;
	int count=0;
	void printDivisionSum(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num%3==0 && num%5==0){
				sum = temp+num;	
				temp = sum;
				count++;
			}
		}
		System.out.println("In the range "+startRange+" to "+endRange+", calculated sum is "+sum);
		System.out.println("In the range "+startRange+" to "+endRange+", "+count+" numbers are divisible by 3 and 5.");
	}
	
	public static void main(String[] args){
		Assignment14 assig14 = new Assignment14();
		assig14.printDivisionSum(1,70);
	}
}
