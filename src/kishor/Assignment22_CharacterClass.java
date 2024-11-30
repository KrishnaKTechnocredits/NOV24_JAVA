package kishor;

public class Assignment22_CharacterClass {
	
	int getDigit(String str) {
		int count =0;
		for(int i=0; i<str.length();i++) {
			boolean flag=Character.isDigit(str.charAt(i));
			if(flag==true) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Assignment22_CharacterClass assignment22 = new Assignment22_CharacterClass();
		int ans=assignment22.getDigit("aa1kan33ks4h5a");
		System.out.println("total "+ans+ " digits are there in given input.");
	}
	
}
