package rajashree;
//Assignment-36
class PrintTable{
	
	void print1to5Table(){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=10; j++){
				System.out.println(i+ "*" +j + "=" +(i*j) +",");
			}
			System.out.println("---------------");
		}
	}
	public static void main (String[] args){
		PrintTable ex32 = new PrintTable();
		ex32.print1to5Table();
	}
}