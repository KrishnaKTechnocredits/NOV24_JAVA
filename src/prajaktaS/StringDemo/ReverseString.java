package prajaktaS.StringDemo;

public class ReverseString {
	
	void revStr1(String str) {
		
		for (int index=str.length()-1;index>=0;index--)
		{
			System.out.println(str.charAt(index));
		}
	}
	public static void main(String[] args) {
		
		new ReverseString().revStr1("te ch3no"); 
	}

}
