/*
#*#*#
#*#
#*#*#
#*# 
*/

package sindhu.StringAssignment;

public class Assignment45 {
	
	void getPattern() {
		for(int i=1; i<=4; i++) {
			if(i%2!=0) {
				//System.out.println();
				for(int j=1; j<=5; j++) {
					if(j%2!=0) {
						System.out.print("#");
					}else {
						System.out.print("*");
					}
				}
			}else {
				System.out.println();
				for(int j=1; j<=3; j++) {
					if(j%2!=0) {
						System.out.print("#");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment45 assign45 = new Assignment45();
		assign45.getPattern();
	}
}
