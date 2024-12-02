package swapnil;

public class charCount {
	int uCount;
	int lCount;
	int dCount;
	int sCount;
	int spCount;
	
	void uppercase(String str) {
		for(int num=0;num<str.length();num++){
			if(Character.isLetter(str.charAt(num))) {
				if(Character.isUpperCase(str.charAt(num))) {
					uCount++;
				}
				else {
					lCount++;
				}
			}
			else if(Character.isDigit(str.charAt(num))){
					dCount++;
				}
				else {
					if(str.charAt(num)==' ') {
						sCount++;
					}
					else {
						spCount++;
					}
				}
			}
		
		System.out.println(+uCount);
		System.out.println(+lCount);
		System.out.println(+dCount);
		System.out.println(+sCount);
		System.out.println(+spCount);
	}
	public static void main(String[] args) {
		charCount c = new charCount();
		c.uppercase("Te4c_hno Credits");

	}

}
