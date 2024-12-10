package kavita;
/*print table for 1 to 5 numbers.
 * Time: 7m*/
public class Assignment36{
	void printNumbers() {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=10;j++) {
			System.out.println(i+ "*" +j+ "=" +(i*j));
		}
		System.out.println("-----------------");
	}
	
}
	
	public static void main(String[] args) {
		Assignment36 assignment36=new Assignment36();
		assignment36.printNumbers();
	}
}
