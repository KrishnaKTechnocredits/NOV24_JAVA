package ravindra;

public class Assignment_108 {
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
		System.out.println(option + "--->" + option.getValue());
	}
	
	public static void main(String[] args) {
		Assignment_108 assignment=new Assignment_108();
		assignment.displayMenu(LeftMenu.JOBOPENINGS);
	}
}
