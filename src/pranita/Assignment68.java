package pranita;

class Assignment68{
	
	void printRearrangedString(String input){
		System.out.println("Given string is: " + input);
		String uCase="", lCase="";
		int digitSum=0;
		for(int i = 0; i<input.length(); i++){
			char ch = input.charAt(i);
			if(Character.isUpperCase(ch)){
				uCase +=ch;
			}
			if(Character.isLowerCase(ch)){
				lCase +=ch;
			}
			if(Character.isDigit(ch)){
				int num = Character.getNumericValue(ch);
				digitSum += num;
			}
		}
		System.out.println("Rearranged string and sum of digits as: " + uCase + digitSum + lCase);
	}
	
	public static void main(String[] args){
		Assignment68 A68 = new Assignment68();
		A68.printRearrangedString("Te1ch6NOCre4dits");
	}
}