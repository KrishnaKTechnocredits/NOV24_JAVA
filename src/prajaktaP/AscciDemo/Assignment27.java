package prajaktaP.AscciDemo;

public class Assignment27 {
		
			char getChar(int val) {
			System.out.println(" Ascii Value is = " + val);
			char ch = (char) val;
			return ch;
		}

		public static void main(String[] args) {
			Assignment27 a27 = new Assignment27();
			System.out.println("Given Ascii Value is "+a27.getChar(65));
			System.out.println("Given Ascii Value is "+a27.getChar(90));
			System.out.println("Given Ascii Value is "+a27.getChar(55));
		}
	}

