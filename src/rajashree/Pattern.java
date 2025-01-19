package rajashree;
//Assignment-38
class Pattern{
	void printPattern(){
		for(int i=1; i<=4 ; i++){
			for(int j=1 ; j<=i ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args){
		Pattern ex38 = new Pattern ();
		ex38.printPattern();
	}
}