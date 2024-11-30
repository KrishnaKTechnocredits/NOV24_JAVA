package mahesh;

public class Assignment_19 {
	
	void printStringReverse (String input) {
		
		for (int i = input.length()-1; i>=0; i--) {
			System.out.println(input.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Assignment_19 assignment = new Assignment_19();
		assignment.printStringReverse("te ch3no");
	}

}
