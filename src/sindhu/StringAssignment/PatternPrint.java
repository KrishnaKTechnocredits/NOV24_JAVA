/*write a logic to print below pattern.
 
* 
* # 
* # * 
* # * # 
* # * # *           */

package sindhu.StringAssignment;

public class PatternPrint {
	void getPattern() {
		for(int i=1 ; i<=5 ; i++){
			for(int j=1 ; j<=i ; j++){
				if(j%2==0){
					System.out.print("#" +" " );
				}
				else{
					System.out.print("*"+" " );
				}
		    }
		    System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternPrint patprnt = new PatternPrint();
		patprnt.getPattern();
	}
}
