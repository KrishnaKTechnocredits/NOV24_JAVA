package pranita;

public class Assignment_12 {
	
	void printData(int startRange , int endRange) {
		System.out.println("Num Divisible by 5&3:");
			for(int num = startRange; num <= endRange; num++) {
				if(num%5==0 && num%3==0) {
					System.out.println(num);
				}
			}
	}
	
	public static void main (String [] args) {
		Assignment_12 assignment_12 = new Assignment_12();
		assignment_12.printData(5,40);
		
	}

}
