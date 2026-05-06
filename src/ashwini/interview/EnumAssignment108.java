package ashwini.interview;
/*
 Assignment - 108 : 5th Feb

Create enum as LeftMenu, provide all options visible in the image. 
Create a method called displayMenu, based on given parameter print value of that option. 

Input : displayMenu(JOBOPENINGS);
output : JOBOPENINGS + "-->" + Job Openings
 */
public class EnumAssignment108 {
	enum LeftMenu{
		DASHBOARD("Dashboard"),JOBOPENINGS("Job Openings"),ASSESMENTS("Assesments"),CANDIDATES("Candidates"),INTERVIEWS("Interviews"),TALENTPOOL("Talent Pool");
		
		private String value;
		LeftMenu(String value){
			this.value=value;
		}
		public String getValue() {
			return value;
		}
	}
	void displayMenu(LeftMenu menu) {
		System.out.println(menu+ "-->" +menu.getValue());
	}
	
public static void main(String[] args) {
	EnumAssignment108 a108=new EnumAssignment108();
	a108.displayMenu(LeftMenu.JOBOPENINGS);
	
}
}

