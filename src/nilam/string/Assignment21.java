package nilam.string;
//Find the length of the given string excluding space. 

public class Assignment21 {
	
	String str;
	int wspace=0,space=0;
	void printLengthOfString(String s) {
		str=s;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==(' ')) {
				space++;	
			}
			else {
				wspace++;
			}
		}
			System.out.println("Length without spaces is " +wspace+ " and space characters are "+space);
	}

	public static void main(String[] args) {
		Assignment21 assignment21=new Assignment21();
		assignment21.printLengthOfString("  Techno Credits ");
	}
}
