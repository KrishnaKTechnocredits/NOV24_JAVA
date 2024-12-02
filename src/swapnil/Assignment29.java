package swapnil;

public class Assignment29 {
	
	void getAscii(char start, char end  ) {
		for(char start1= start ; start1<=end ; start1++) {
			int ch = start1;
			System.out.print(" "+start+" "+ch+" ");
			
		}
		
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		assignment29.getAscii('A', 'Z');
		System.out.println();
		assignment29.getAscii('a', 'z');
		System.out.println();
		assignment29.getAscii('0', '9');
	}

}
