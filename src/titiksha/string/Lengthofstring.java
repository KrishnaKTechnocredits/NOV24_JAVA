//Find the length of the given string excluding space. 
//input : prem lata gupta

package titiksha.string;

public class Lengthofstring {
	int count;
	int cnt;
	//method 1
	int getlenthofstring(String name) {
		System.out.println("The length of string without space is: ");
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) !=' ') {
			count++;
			}
		}
		return count;
	}
	
	//method 2
	int getlegthofstring2(String name) {
		System.out.println("The length of string without space with method is : ");
		int totalLen=name.length();
		for(int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
				if(ch==' ') {
				cnt++;
				}
		}
		int len =totalLen-cnt;
		return len;
	}
	
	public static void main(String[] args) {
		Lengthofstring lengthofstring=new Lengthofstring();
		int length=lengthofstring.getlenthofstring("prem lala gupta");
		System.out.println(length);
		System.out.println(lengthofstring.getlegthofstring2("prem lala gupta"));
		
	}

}
