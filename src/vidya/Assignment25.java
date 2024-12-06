package vidya;

public class Assignment25 {
	int processData(String str) {
		int sum =0;
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum+Character.getNumericValue(ch);
			}
			}
		return sum;
				}
	


public static void main(String[] args) {
	Assignment25 asgn25 = new Assignment25();
	int sum1 = asgn25.processData("te1ch2no3cre7dits");
	System.out.println("Sum of all characters is "+sum1);
	int sum2 = asgn25.processData("techno");
	System.out.println("Sum of all characters is "+sum2);
	int sum3 = asgn25.processData("4561");
	System.out.println("Sum of all characters is "+sum3);
}
}
