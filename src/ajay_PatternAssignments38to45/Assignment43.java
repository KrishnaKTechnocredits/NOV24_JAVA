package ajay_PatternAssignments38to45;

public class Assignment43 {
	
	void patternPrinting() {
		char count='A';
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(count +" ");
				count++;
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment43 pattern6=new Assignment43();
		pattern6.patternPrinting();

	}

}
