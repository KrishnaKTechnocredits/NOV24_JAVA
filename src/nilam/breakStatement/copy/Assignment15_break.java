package nilam.breakStatement.copy;

public class Assignment15_break {
	int count=0;
	
	void numDivisibleby(int startNum, int endNum) {
		System.out.println("First 3 numbers divisible by 3 & 4 is:");
		for(int start=startNum;start<=endNum;start++) {
			if(start%3==0 && start%4==0) {
				System.out.println(start);
				count++;
			}
			if(count==3) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15_break assignment15_break= new Assignment15_break();
		assignment15_break.numDivisibleby(10, 500);
	}

}
