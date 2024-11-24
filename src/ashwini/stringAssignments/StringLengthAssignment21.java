package ashwini.stringAssignments;

public class StringLengthAssignment21 {
		void stringLength(String str) {
			int count=0;
			int input=0;
			for(int index=0;index<str.length();index++) {
				if(str.charAt(index)!=' ') {
					count++;
				}else if(str.charAt(index)==' ') {
					input++;
				}
			}			
			System.out.println("length without space is "+count+" and space characters are "+input);

		}
			
	public static void main(String[] args) {
		StringLengthAssignment21 assn21=new StringLengthAssignment21();
		assn21.stringLength("prem lata gupta");
	}

}
