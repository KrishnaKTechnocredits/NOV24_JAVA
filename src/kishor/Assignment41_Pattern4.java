package kishor;

public class Assignment41_Pattern4 {
	
	void printPatter() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment41_Pattern4 assignment41 = new Assignment41_Pattern4();
		assignment41.printPatter();
	}
}
