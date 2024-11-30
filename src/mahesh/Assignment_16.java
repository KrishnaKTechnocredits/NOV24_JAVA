package mahesh;

public class Assignment_16 {
	
	int sum;
	int count = 1;
	
	void numbersDivisible (int startRange, int endRange) {
		
		for (int i=startRange; i<=endRange; i++) {
			if (count<=3) {
				if (i%5==0 && i%7==0) {
					sum = sum+i;
					count++;
				}
			}
		}
		System.out.println("The sum of first 3 numbers divisible by 5 and 7 from range "+startRange+" to "+endRange+" is "+sum);
		System.out.println("The average of first 3 numbers divisible by 5 and 7 from range "+startRange+" to "+endRange+" is "+sum/3);
	}
	
	public static void main(String[] args) {
		Assignment_16 assignment = new Assignment_16();
		assignment.numbersDivisible(1, 210);
	}

}
