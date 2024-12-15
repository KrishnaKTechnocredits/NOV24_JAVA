package prem;

public class Assignment43 {
	
	void patternPrint() {
		char ch='A';
		for(int i =1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(ch +" ");
			ch++;
	     }
		System.out.println( );
		}
	}
		
		public static void main(String[] args) {
			Assignment43 assign43= new Assignment43();
			assign43.patternPrint();
}

}
