package swapnil;

public class Assignment40 {
	void pattern() {
		int count = 1;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		assignment40.pattern();
	}
}
