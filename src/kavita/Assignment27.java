package kavita;
/*Write a method which returns character of given ascii value.
input : 65
output : A

input : 90
output : Z

input : 55
output : 8 
Time: 7m*/
public class Assignment27 {
	void asciiTochracter(int ascii) {
		char ch=(char)ascii;
		System.out.println(ch+" has ascii value "+ascii);
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27=new Assignment27();
		assignment27.asciiTochracter(65);
		assignment27.asciiTochracter(90);
		assignment27.asciiTochracter(55);
	}
}
