package prajaktaP.AscciDemo;

public class Assignment30 {
	
	    	int getSumOfEvenDigitsInString(String str) {
			int sum = 0;
			for (int i = 0; i < str.length();i++) {
				if ((Character.isDigit(str.charAt(i))) && ((Character.getNumericValue(str.charAt(i)))%2==0)){
					sum = sum + Character.getNumericValue(str.charAt(i));
				}
			}
			return sum;
		}

		public static void main(String[] args) {
			Assignment30 a30 = new Assignment30();
			System.out.println(a30.getSumOfEvenDigitsInString("te1ch2no3cre7dits"));
			System.out.println(a30.getSumOfEvenDigitsInString("techno"));
			System.out.println(a30.getSumOfEvenDigitsInString("4563"));

		}

}
