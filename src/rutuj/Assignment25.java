package rutuj;

public class Assignment25 {


	static void m1(String str) {
		int sum = 0 ;
		for (int i = 0; i < str.length(); i++) {

			char ch =str.charAt(i);
			if(Character.isDigit(ch))
			{
				int num = Character.getNumericValue(ch);
				sum = sum +  num;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		
		String str = "te1ch2no3cre7dits";
		Assignment25.m1(str);
	}

}
