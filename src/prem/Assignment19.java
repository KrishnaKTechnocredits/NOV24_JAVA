package prem;

public class Assignment19 {
	
	void stringReverseOrder() {
		String str="te ch3no";
		System.out.println(str.length());
		
		for(int i= str.length()-1;i>=0;i--) {
			char ch =str.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		Assignment19 assign19 =new Assignment19();
		assign19.stringReverseOrder();			
	}

}
