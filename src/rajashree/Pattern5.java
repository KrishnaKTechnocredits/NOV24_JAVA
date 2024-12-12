package rajashree;
//Assignment-44
class Pattern5{
	void printPattern5(){
		for(int i=1; i<=4 ; i++){
			for(int j=1 ; j<=i ;j++){
				System.out.print("*");
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args){
		Pattern5 ex44 = new Pattern5 ();
		ex44.printPattern5();
	}
}
	