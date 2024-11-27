package reshma;

public class Assignment21_lengthofstring {
	void printlengthofstring(String str) {
		int count=0;
		for(int i=0;i<=str.length()-1;i++){
			if(str.charAt(i)!=' '){
				count++;
			}
		}
			System.out.println("length without space is " +count+ " and space characters are " +(str.length()-count));
		}
	
		public static void main(String[]args) {
		Assignment21_lengthofstring str=new Assignment21_lengthofstring();
		str.printlengthofstring("Prem lata gupta");
		}
}
