//write a method to print ascii values for character A to Z , a to z , 0-9

package titiksha.Ascii;

public class Asciiwithinrange {
	void getasciiofcharacters(char start, char end) {
		System.out.println("The ascci of given charcter range is :");
		for (char index = start; index <= end; index++) {
			int ascii = index;
			System.out.println(index+ " = " + ascii);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Asciiwithinrange asciiwithinrange = new Asciiwithinrange();
		asciiwithinrange.getasciiofcharacters('A', 'Z');
		asciiwithinrange.getasciiofcharacters('a', 'z');
		asciiwithinrange.getasciiofcharacters('0', '9');
	}

}
