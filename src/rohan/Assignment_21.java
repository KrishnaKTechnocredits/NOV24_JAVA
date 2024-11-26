package rohan;

public class Assignment_21 {

	public static void main(String[] args) {
		
		Assignment_21 count = new Assignment_21();
		count.CountSpace("prem lata gupta");
	}

	void CountSpace(String string) {
		int count =0,spacecount=0;
		for(int i = 0; i<=string.length()-1;i++) {
			if(string.charAt(i) != ' ') {
				count++;
			}else if(string.charAt(i) == ' ') {
				spacecount++;
			}
		}
		System.out.println("Length without space is "+count+" and space count are "+spacecount);
	}
}
