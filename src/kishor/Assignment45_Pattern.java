package kishor;

public class Assignment45_Pattern {
	
	void printPattern() {
		for(int i=1;i<=4;i++) {
			if(i%2!=0) {
				for(int k=1;k<=5;k++) {
					if(k%2!=0) {
						System.out.print("#");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			else {
				for(int j=1;j<=3;j++) {
					if(j%2!=0) {
						System.out.print("#");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment45_Pattern assignment45 = new Assignment45_Pattern();
		assignment45.printPattern();
	}
}