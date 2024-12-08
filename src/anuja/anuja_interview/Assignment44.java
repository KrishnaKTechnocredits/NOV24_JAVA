package anuja.anuja_interview;
/*

*
* #
* # *
* # * #

 */
public class Assignment44 {
	
	void printPatternStar() {
		for(int i=1;i<=5;i++) {
			for(int j =1; j<=i ; j++) {
				if(j%2!=0)
				System.out.print("*" +" ");
				else
				System.out.print("#" + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Assignment44 assignment44 = new Assignment44();
		assignment44.printPatternStar();
	}
}
