package anuja.practice1stround;

public class StringAllMethods {

	public static void main(String[] args) {
		String name = "Anuja123$%^&00anujaanujaakakKAKA" ;
		String newStrfromChar = name.valueOf(name.charAt(3));
		System.out.println(newStrfromChar);//output is string j 
		System.out.println(newStrfromChar+ "    "+ name);//result concated 2 strings
		System.out.println(name.replace('K', 'n'));// replace all occurance of K and replace with capital n.
		System.out.println(name.replace("a", "123"));//replace all small anuja string with capital ANUJA.
		System.out.println(name.replaceAll("a", "123"));//only replaceall occurcane of string a with new string 123
		
		//indexof method in detail 
		
		String newStr = "AAKk 123AAKkj#$@@@@a" ;// mix of small caps numbers etc
		
		for(int i = 0 ;i<newStr.length() ; i++) {
			char ch = newStr.charAt(i);
			int indexOf = newStr.indexOf(ch);
			System.out.println(ch+"------------------->"+ indexOf);
		}
		System.out.println(newStr.indexOf('t'));//index of nonpresent char.

	}
}