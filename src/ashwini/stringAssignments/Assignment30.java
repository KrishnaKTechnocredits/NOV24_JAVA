package ashwini.stringAssignments;

public class Assignment30 {
	int index;
	int getSumEvenDigit(String str){
		int sum=0;
		for (int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			boolean flag=Character.isDigit(ch);
			if(flag==true) {
				int num=Character.getNumericValue(ch);
				if(num%2==0) {
					sum=sum+num;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment30 assn30=new Assignment30();
		int ans = assn30.getSumEvenDigit("te1ch2no3cre7dits");
		int ans2 = assn30.getSumEvenDigit("techno");
		int ans3 = assn30.getSumEvenDigit("4563");
		System.out.println("In String te1ch2no3cre7dits sum of  even digits is "+ ans);
		System.out.println("In String techno sum of even digits is " +ans2);
		System.out.println("In String 4563 sum of even digits are " +ans3);
	}

}
