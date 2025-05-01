//Assignment - 108 : 5th Feb
//
//Create enum as LeftMenu, provide all options visible in the image. 
//Create a method called displayMenu, based on given parameter print value of that option. 
//
//Input : displayMenu(JOBOPENINGS);
//output : JOBOPENINGS + "-->" + Job Openings

package fazrana.enumClass;

public class FAssignment108 {
	enum LeftMenu{
		Dashboard("Dashboard"),JOBOPENING("Job Opening"),ASSIGNMENT("Assignment"),CANDIDATES("Candidates"),INTERVIEWS("Interviews"),TALENTPOOL("Talent Pool");
	
		private String value;
		LeftMenu(String value){
			this.value=value;
		}
		
		String getValue() {
			return value;
		}
	}
	
	void displayMenu(LeftMenu mu) {
		System.out.println(mu+"->>"+ mu.getValue());
	}
	
	public static void main(String[] args) {
		FAssignment108 fassignment108=new FAssignment108();
		fassignment108.displayMenu(LeftMenu.JOBOPENING);
	}
	
}
