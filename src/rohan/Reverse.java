package rohan;

public class Reverse {

	public static void main(String[] args) {
	
		Reverse reverse = new Reverse();
		reverse.StringReverse("te ch3no");
	}
	void StringReverse(String string) {
		for(int i= string.length()-1;i>=0;i--) {
			System.out.println(string.charAt(i));
		}
	}

}
