//write a method to print all the characters having ascii value from 65 to 100.
package titiksha.Ascii;

public class Asciifromgivenrange {
	void getAsciiOfNumber(int startrange, int endrange) {
		System.out.println("The character lie under asccii " + startrange + " to " + endrange + " are ");
		for (int i = startrange; i <= endrange; i++) {
			char character = (char) i;
			System.out.println(i+ " = "+character);
		}
	}

	public static void main(String[] args) {
		Asciifromgivenrange asciifromgivenrange = new Asciifromgivenrange();
		asciifromgivenrange.getAsciiOfNumber(65, 100);
	
	}
}

