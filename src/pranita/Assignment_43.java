package pranita;

public class Assignment_43 {
	void getPattern() {
		char ch = 'A';
		for(int i=1;i<=4; i++) {
			for(char j=1; j<=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		Assignment_43 assignment43 = new Assignment_43();
		assignment43.getPattern();
	}
}
