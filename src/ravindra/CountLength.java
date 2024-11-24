package ravindra;

public class CountLength {
	void lengthCountWithoutSpace(String name) {
		int totalLength=name.length();
		int count=0;
		for(int i=0;i<name.length();i++) {
			char chars= name.charAt(i);
			if(chars==' ') {
				count++;
			}
		}int withoutSpaceCount = totalLength-count;
		System.out.println("length without space is " +withoutSpaceCount+" and space characters are "+count);
	}
	
	public static void main(String []args) {
		CountLength countLength=new CountLength();
		countLength.lengthCountWithoutSpace("prem lata gupta");
	}
} 