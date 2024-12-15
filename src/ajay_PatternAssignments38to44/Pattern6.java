package ajay_PatternAssignments38to44;

public class Pattern6 {
	
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
		Pattern6 pattern6=new Pattern6();
		pattern6.patternPrinting();

	}

}
