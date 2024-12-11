package rajashree;
//Assignment-40
class Pattern2{
	void printPattern2(){
		int count = 1;
		for(int i=1; i<=4 ; i++){
			for(int j=1; j<=i ; j++){
			System.out.print(count + " ");
			count++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Pattern2 ex40 = new Pattern2();
		ex40.printPattern2();
	}
}
				