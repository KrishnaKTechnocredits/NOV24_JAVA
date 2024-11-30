package kishor;

public class Assignment17_Break {
	
	void printData(int endRange, int startRange) {
		int count=0;
		for(int i=endRange;i>=startRange;i--) {
			if(i%5==0) {
				System.out.println("The number which is divisible by 5 is:-" + i);
				count++;
				if(count==5) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17_Break assignment17 = new Assignment17_Break();
		assignment17.printData(500, 10);
	}
}
