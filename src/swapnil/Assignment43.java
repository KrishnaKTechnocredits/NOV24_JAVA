package swapnil;

public class Assignment43 {
	void pattern() {
		char count ='A';
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Assignment43 assignment43 = new Assignment43();
		assignment43.pattern();
	}
}
