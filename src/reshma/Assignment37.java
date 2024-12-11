package reshma;

public class Assignment37 {
	void printFreqOfChar(String input) {		
		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			if (i == input.indexOf(input.charAt(i))) {
				for (int index = 0; index < input.length(); index++) {
					if (input.charAt(i) == input.charAt(index)) {
						count++;	
								}
								
					}
						
			 	
		System.out.println("Freq count of char " +input.charAt(i)+ " - " +count);
			 }
		}
			 	
	}

	public static void main(String[] args) {
		Assignment37 a37 = new Assignment37();		
		a37.printFreqOfChar("aakanksha");

	}
}
