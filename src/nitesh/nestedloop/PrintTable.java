/*print table for 1 to 5 numbers.
 * Assignment-36
*/
package nitesh.nestedloop;

public class PrintTable {

	void tableprinting(){
		for(int i=1;i<=5;i++){
			int sum = 0;
			for(int j=1;j<=5;j++){
				sum = i*j;
				System.out.println(i +"*" +j +" = "+ sum);
			}
			System.out.println("------------------");
		}
	}
	public static void main(String[] args){
		PrintTable printtable = new PrintTable();
		printtable.tableprinting();
	}

}
