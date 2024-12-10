//#*#*#
//#*#
//#*#*#
//#*#

package fazrana.pattern;

public class FAssignment45 {
	void printPattern() {
		for(int i=1;i<=4;i++) {
			if (i%2!=0) {
				System.out.println("#*#*#");
			}else {
				System.out.println("#*#");
			}
		}
	}
	
	public static void main(String[] args) {
		FAssignment45 fassignment45=new FAssignment45();
		fassignment45.printPattern();
	}
}
