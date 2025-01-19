package rajashree;
//Assignment-41
class Pattern3{
	void printPattern3(){
		for(int i=1; i<=5 ; i++){
			for(int j=1; j<=4 ; j++){
			System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Pattern3 ex40 = new Pattern3();
		ex40.printPattern3();
	}
}