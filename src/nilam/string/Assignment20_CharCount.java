package nilam.string;

public class Assignment20_CharCount {
	static int count=0;
	int getCountOfChar(String str, char Ch) {
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==Ch) {
				count++;			
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		new Assignment20_CharCount().getCountOfChar("Technocredits",'i');
		System.out.println(count);
	}
}



/*public class Assignment20_CharCount {
	int getCountOfChar(String str, char Ch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==Ch) {
				count++;			
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str="Technocredits";
		char Ch='c';
		int count= new Assignment20_CharCount().getCountOfChar(str,Ch);
		System.out.println("Char "+Ch+ " occures in the string: "+count+" times.");
	}
}
*/
