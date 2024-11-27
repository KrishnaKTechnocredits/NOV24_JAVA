package reshma;

public class Assignment22_PrintDigitsCount {
	int count=0;
	int getDigits(String str){
		for (int i=0;i<=str.length()-1;i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args) {
		Assignment22_PrintDigitsCount assignment22=new Assignment22_PrintDigitsCount();
		assignment22.getDigits("aa1kan33ks4h5a");
		System.out.println(" total " + assignment22.count + " digits are there in given input.");
	}
}
