/*  
Print below Pattern
1 
1 2 
1 2 3 
1 2 3 4 
*/
package ajay_PatternAssignments38to44;

class Assignment39{
	void patternprinting(){
		int i;
		int j;
		for( i=1;i<=4;i++){
			for(j=1;j<=i;j++){
				System.out.print(j +" ");	
			}System.out.println();	
		}
	}
	public static void main(String[] args){
		Assignment39 pattern=new Assignment39();
		pattern.patternprinting();
	}
}