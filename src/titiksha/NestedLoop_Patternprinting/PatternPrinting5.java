//Print below pattern
//    1
//   2 2
//  3 3 3
// 4 4 4 4
// mujhe logic lgna hai row wise value increase ho
package titiksha.NestedLoop_Patternprinting;

public class PatternPrinting5 {
	
	void pattern5() {
		int j;
		int i;
		for (i = 1; i <= 4; i++) {
			for (j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
	}
// print below output
// 1
// 1 2
// 1 2 3
// 1 2 3 4
	
	void pattern6() {
		//int count=1;// if you want i+j value in increment order
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				//count++;
				
			}
			System.out.println();
		}}
		
//print reverse order
// 1 2 3 4
// 1 2 3
// 1 2
// 1
	void pattern7() {
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}}
// pattern
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
		
	void pattern8() {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2!=0) {
					System.out.print('0'+" ");
				}
				else {
					System.out.print('1' +" ");
				}
				
			
			
			}
			System.out.println();
		}
		
	
	
		
		
	}
	public static void main(String[] args) {
		PatternPrinting5 patternPrinting5 = new PatternPrinting5();
		patternPrinting5.pattern5();
		System.out.println();
		patternPrinting5.pattern6();
		System.out.println();
		patternPrinting5.pattern7();
		System.out.println();
		patternPrinting5.pattern8();
		
	}

}
