package reshma;

public class Assignment14_SumOfNumber {
	int sum=0;
	int count=0;
	void printSumOfNum(int startindex,int endindex){
		for (int i=1;i<=70;i++){
		if(i%3==0 && i%5==0){	
		sum= sum + i;
		count++;
	}
	}
		System.out.println("In the range "+ startindex+ " to " +endindex+ " , calculated sum is  "  +sum);
		System.out.println("In the range " + startindex + " to " + endindex + " , " + count + " numbers are divisible by 3 & 5");
	}

	public static void main(String[] args) {
		Assignment14_SumOfNumber d=new Assignment14_SumOfNumber();
		d.printSumOfNum(1,70);
			
	}
}
