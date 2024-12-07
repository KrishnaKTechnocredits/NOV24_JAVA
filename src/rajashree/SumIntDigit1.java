package rajashree;
class SumIntDigit1{
	//30.Sum of all the even digits present in a given String.
	void sumDigit(String str){
		int sum  = 0;
		for(int index=0;index < str.length();index++){
			Character ch = str.charAt(index);
			if(Character.isDigit(ch)){
				int digit = Character.getNumericValue(ch);
				if(digit%2==0){
				sum = sum + digit;
				}
			}
		}
		System.out.println(sum);
	}
	public static void main (String[] args){
		SumIntDigit1 sumIntDigit = new SumIntDigit1();
		sumIntDigit.sumDigit("te1ch2no3cre7dits");
		sumIntDigit.sumDigit("techno");
		sumIntDigit.sumDigit("4563");
	}
}