package anuja.practice1stround;

public class IndexOfString {
	public static void main(String[] args) {
	String longName = "anuja anuja ANUJA ANUJA";
	String[] newString = longName.split("");
	for (String subString1 : newString) {
		int str1index = subString1.indexOf(subString1);
		System.out.print(str1index);
	}
}
}