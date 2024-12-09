package prajaktaP.AscciDemo;

public class Assignment28 {

		void displayChar(int startRange, int endRange) {
			for(; startRange<=endRange;startRange++) {
				char ch = (char)startRange;
				System.out.println(startRange+"  --->  "+ch);
			}
		}

		void displayAscii(char chStart, char chEnd) {
			for (;chStart<=chEnd; chStart++) {
				int i = chStart;
				System.out.println(chStart+"  --->  "+i);
			}
		}

		public static void main(String[] args) {
			Assignment28 a28 = new Assignment28();
			a28.displayChar(65, 90);
			a28.displayAscii('A', 'Z');
		}

	}


