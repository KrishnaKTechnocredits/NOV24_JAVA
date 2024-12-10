package prem;

public class Assignment44 {
	
	void patternPrint() {
		String star= "*";
		String starHash= "#";
		
		for(int i =1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			if(j%2!=0)
			System.out.print( star);
			else
				System.out.print( starHash);
		}
		System.out.println( );
		}
	}
		
		public static void main(String[] args) {
			Assignment44 assign44= new Assignment44();
			assign44.patternPrint();
}

}
