package kishor;

public class Assignment19_StringRev {
	
	void printreverse(String str) {
		for(int index=str.length()-1;index>=0;index--) {
			System.out.println(str.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Assignment19_StringRev assignment20 = new Assignment19_StringRev();
		assignment20.printreverse("te ch3no");
	}
}
