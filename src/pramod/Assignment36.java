//Assignment - 36 : 8th Dec [10 mins]
//print table for 1 to 5 numbers.

package pramod;
class Assignment36{
	
	void printTable(){
		System.out.println("Table for 1 to 5 is:");
		for(int i=1; i<=5; i++){
			for(int j=1; j<=10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));	
			}
			System.out.println("-----------------");
		}
	}	
	
	public static void main(String[] args){
		Assignment36 PT =new Assignment36();
		PT.printTable();
	}
}