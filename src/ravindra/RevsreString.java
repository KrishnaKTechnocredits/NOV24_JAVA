package ravindra;

public class RevsreString {
	void revrseString(String name) {
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(name.charAt(i));
		}
	}
	
	public static void main(String []args) {
		RevsreString revsreString=new RevsreString();
		revsreString.revrseString("te ch3no");
	}
}
