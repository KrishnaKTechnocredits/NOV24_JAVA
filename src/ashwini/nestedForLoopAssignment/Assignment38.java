package ashwini.nestedForLoopAssignment;
/* write a logic to print below pattern--o/p-->
*
**
***
****  */
public class Assignment38 {
	void printPattern(){
		for(int i=0;i<4;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}			
	}
	public static void main(String[] args){
		Assignment38 assn38=new Assignment38();
		assn38.printPattern();
		
	}
}
	
	 


