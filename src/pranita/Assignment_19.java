package pranita;

public class Assignment_19 {
	
	void revStr1(String str) {
		
		for (int index=str.length()-1;index>=0;index--)
		{
			System.out.println(str.charAt(index));
		}
	}
	public static void main(String[] args) {
		
		new Assignment_19().revStr1("te ch3no"); 
	}

}
