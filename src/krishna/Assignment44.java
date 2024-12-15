package krishna;

public class Assignment44 {
	
	void printPattern() {
		for(int i = 1;i<=4;i++) {
			for(int j = 1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("*" + " ");
				}else
					System.out.print("#"+ " ");
			}
			System.out.print(System.lineSeparator());
		}
	}

	public static void main(String[] args) {
		new Assignment44().printPattern();
		
	}
}
