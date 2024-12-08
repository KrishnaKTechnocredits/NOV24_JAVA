package kishor;

public class Assignment40_Pattern3 {
	
	void printPatter() {
		int count=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment40_Pattern3 assignment40 = new Assignment40_Pattern3();
		assignment40.printPatter();
	}
}
