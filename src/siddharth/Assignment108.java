package siddharth;
/*
Assignment - 108 : 5th Feb

Create enum as LeftMenu, provide all options visible in the image. 
Create a method called displayMenu, based on given parameter print value of that option. 

Input : displayMenu(JOBOPENINGS);
output : JOBOPENINGS + "-->" + Job Openings
 */
public class Assignment108 {
	enum LeftMenu {
		JOBOPENINGS("Job Openings"), DASHBOARD("Dashboard"), ASSESSMENTS("Assessments"), INTERVIEWS("Interviews"),
		CANDIDETS("Candidets"), TALENTPOOL("Talent pool");

		private String value;

		LeftMenu(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public void displayMenu(LeftMenu option) {
		System.out.println(option + " -> " + option.getValue());
	}

	public static void main(String[] args) {
		Assignment108 assignment108=new Assignment108();
		assignment108.displayMenu(LeftMenu.JOBOPENINGS);
	}
}
