package rajashree;
//Assignment-39
class Pattern1{
	void printPattern1(){
		for(int i=1; i<=4 ;i++){
			for(int j=1; j<=i ; j++){
			 System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Pattern1 ex39 = new Pattern1();
		ex39.printPattern1();
	}
}