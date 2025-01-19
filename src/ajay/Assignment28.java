package ajay;

public class Assignment28 {
	
	
	void printChar(int startRange, int endRange) {
		
		for(int i=startRange;i<=endRange;i++) {
			
			char ch=(char) i;
			System.out.println("Character at " +i +" is= " +ch);
			
		}
	}

	public static void main(String[] args) {
		Assignment28 assignment28=new Assignment28();
		assignment28.printChar(65, 100);
	}

}
