package ajay;

class Assignment23{
	
	void getCountInString(String str){
		int uCount=0;
		int lCount=0;
		int dCount=0;
		int sCount=0;
		int spaceCount=0;
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isLetter(ch)){
				if(Character.isUpperCase(ch)){
					uCount++;
				}else{
						lCount++;
				}
			}else if(Character.isDigit(ch)){
					dCount++;
			}else if(ch==' '){
					spaceCount++;
			}else{
					sCount++;
			}
		}
		System.out.println("Uppercase Letters: " + uCount);
        System.out.println("Lowercase Letters: " + lCount);
        System.out.println("Digits: " + dCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Special Characters: " + sCount);
	}
	public static void main(String[] args){
		Assignment23 assignment23=new Assignment23();
		assignment23.getCountInString("Te4c_hno Credi3ts");
	}
}