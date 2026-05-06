package swapnil;

public class Assignment108 {
	
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
		Assignment108 assignment108=new Assignment108();
		assignment108.displayMenu(LeftMenu.JOBOPENING);
	}
}
