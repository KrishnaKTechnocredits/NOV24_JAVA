package rohan;

public class Assignment_27 {
	char GetChar(int Ascii) {
		char ch = (char) Ascii;
		System.out.println("Input: " + Ascii + "\n" + "Output: " + ch + "\n");
		return ch;
	}

	public static void main(String[] args) {
		Assignment_27 a = new Assignment_27();
		char output1 = a.GetChar(65);
		char output2 = a.GetChar(90);
		char output3 = a.GetChar(55);
		// System.out.println(output1+","+output2+","+output3);
	}
}
