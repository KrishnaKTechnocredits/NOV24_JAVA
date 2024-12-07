package rohan;

public class Assignment_30 {
	
	int SumOfDigits(String input) {
		int EvenSum =0,Num=0;
		for(int i=0;i<input.length();i++) {
			boolean flag = Character.isDigit(input.charAt(i));
			if(flag==true) {
				Num = Character.getNumericValue(input.charAt(i));
				if(Num%2==0) {
					EvenSum += Num;
				}
			}
		}
		System.out.println("Input: " + input + "\n" + "Output: " + EvenSum + "\n");
		return EvenSum;
	}
	public static void main(String[] args) {
		Assignment_30 assignment = new Assignment_30();
		assignment.SumOfDigits("te1ch2no3cre7dits");
		assignment.SumOfDigits("techno");
		assignment.SumOfDigits("4563");
	}

}
