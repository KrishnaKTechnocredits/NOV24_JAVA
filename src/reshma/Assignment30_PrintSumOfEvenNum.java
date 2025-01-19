package reshma;

public class Assignment30_PrintSumOfEvenNum {
	int count=0;
	char ch;
	void printSumOfEvenNum(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			 int num=Character.getNumericValue(ch);
			if(Character.isDigit(ch) && num%2==0) {
				count++;
				sum +=num;
			}
		}
		System.out.println("Sum of even num is: " +sum);
	}
	
		public static void main(String[] args) { 
			Assignment30_PrintSumOfEvenNum assignment30=new Assignment30_PrintSumOfEvenNum();
			assignment30.printSumOfEvenNum("te1ch2no3cre7dits");
			assignment30.printSumOfEvenNum("techno");
			assignment30.printSumOfEvenNum("4563");
			}
}
