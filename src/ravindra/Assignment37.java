package ravindra;

public class Assignment37 {
	void count(String name) {
		for (int i = 0; i < name.length(); i++) {
			int count=0;
			char ch=name.charAt(i);
			int index=name.indexOf(ch);
			if(i==index) {
				for(int j=0;j<name.length();j++) {
					char ch1=name.charAt(j);
					if(ch==ch1) {
						count++;
					}
				}System.out.println(ch+"-->"+count);
			}
		}
	}
	
	public static void main(String[] args) {
		String str="aakanksha";
		Assignment37 countofvariable=new Assignment37();
		countofvariable.count(str);
	}
}
