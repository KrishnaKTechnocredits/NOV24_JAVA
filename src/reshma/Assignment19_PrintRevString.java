package reshma;

public class Assignment19_PrintRevString {
	void printRevString(String str ) {
		for(int index=str.length()-1;index>=0;index--){
			System.out.println(str.charAt(index));
		}
	}
	
	public static void main(String[]args) {
		String str="te ch3no";
		new Assignment19_PrintRevString().printRevString(str);
	}
}
