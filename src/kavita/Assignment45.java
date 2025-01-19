package kavita;
/*Assignment - 45 : 10th Dec 
#*#*#
#*#*
#*#
#*
#
*Time:11min*/
public class Assignment45 {
	void printPattern() {
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++) {
				if(j%2 !=0) {
					System.out.print("#");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment45 assignment45=new Assignment45();
		assignment45.printPattern();
	}
}
