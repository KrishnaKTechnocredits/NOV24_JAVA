//write a logic to print below pattern.
//1
//2 3
//4 5 6
//7 8 9 10



package titiksha.NestedLoop_Patternprinting;

public class PatternPrinting2 {
	int count = 0;

	void patternPrint4(int startnum, int endnum) {
		for (int i = startnum; i <= endnum; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
				
			}
			System.out.println();
		}
	}
	
//write a logic to print below pattern.
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4
// 5 5 5 5
	
	void patternPrint5(int startrange, int endrange) {
		for (int i = startrange; i <= endrange; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
// write a logic to print below pattern.
// 1
// 2 2
// 3 3 3
// 4 4 4 4

	void patternPrint6(int startrange, int endrange) {
		for (int i = startrange; i <= endrange; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
//write a logic to print below pattern.
// A
// B C
// D E F
// G H I J
	void patternPrint7(char ch) {
		int count=0;
		for (int i = 1; i <=4; i++) {
			for (int j =1; j <= i; j++) {
				char count1=(char)(ch+count);
				System.out.print(count1+ " ");
				count++;
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPrinting2 patternPrinting2 = new PatternPrinting2();
		patternPrinting2.patternPrint4(1, 4);
		System.out.println("-------------------"+"\n");
		patternPrinting2.patternPrint5(1, 5);
		System.out.println("-------------------"+"\n");
		patternPrinting2.patternPrint6(1, 4);
		System.out.println("-------------------"+"\n");
		patternPrinting2.patternPrint7('A');
	}
}
