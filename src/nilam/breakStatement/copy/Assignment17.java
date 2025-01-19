package nilam.breakStatement.copy;

public class Assignment17 {
	int count=0;
	void numDivisibleBy(int start, int endNum) {
		System.out.println("Last 5 numbers divisible by 5 is:");
		for(int startNum=endNum;startNum>=start;startNum--) {
			if(startNum%5==0) {
				System.out.println(startNum);
				count++;
				if(count==5) {
					break;
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17=new Assignment17();
		assignment17.numDivisibleBy(10,500);
	}
}
