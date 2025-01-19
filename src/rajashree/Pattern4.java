package rajashree;
//Assignment-42
class Pattern4{
	void printPattern4(){
		for(int i=1; i<=4 ; i++){
			for(int j=1; j<=i ; j++){
			System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Pattern4 ex40 = new Pattern4();
		ex40.printPattern4();
	}
}