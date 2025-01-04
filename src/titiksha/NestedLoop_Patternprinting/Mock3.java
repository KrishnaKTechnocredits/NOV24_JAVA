//     1A
 //    2B 3C
   //  4D 5E 6F
   //  7G 8H 9I 10J


package titiksha.NestedLoop_Patternprinting;

public class Mock3 {
	int count=1;
	//char ch;
	void pattern(char ch) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+""+ch+" ");
				count++;
				ch++;
	}
			System.out.println();
		}
		}
		public static void main(String[] args) {
			Mock3 mock3=new Mock3();
			mock3.pattern('A');
		
	}

}
