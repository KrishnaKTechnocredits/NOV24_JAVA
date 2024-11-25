package prem;

public class Assignment21 {
	static int count;
	static int charLength;
	
    int getCharLength(String str) {
		int length= str.length();
		  for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==' ') {
				count++;
			}	
		  }
		  int charLength = length- count;
	      return charLength;
	}
    
	public static void main(String[] args) {
		Assignment21 assign21 = new Assignment21();
		int ans = assign21.getCharLength("prem lata gupta");
		System.out.println("length without space is "+ ans +" and space characters are "+ count );
	}
	
}
