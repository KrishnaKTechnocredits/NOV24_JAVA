package kishor;

public class Assignment44_Pattern7 {

	void printPatter() {
		for (int i = 1; i <= 5; i++) {
			for(int j=1;j<=i;j++) {
				if(j%2!=0) {
					System.out.print("*");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment44_Pattern7 assignment44 = new Assignment44_Pattern7();
		assignment44.printPatter();
	}
}
