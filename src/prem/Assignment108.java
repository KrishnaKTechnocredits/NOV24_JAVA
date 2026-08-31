package prem;

public class Assignment108 {

	enum LeftMenu {
		DASHBOARD("Dashboard"), JOBOPENINGS("Job Openings"), ASSESMENTS("Assesments"), CANDIDATES("Candidates"),
		INTERVIEWS("Interviews"), TALENTPOOL("Talent Pool");

		private String value;

		LeftMenu(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	void displayMenu(LeftMenu menu) {
		System.out.println(menu + "-->" + menu.getValue());
	}

	public static void main(String[] args) {
		Assignment108 assign108 = new Assignment108();
		assign108.displayMenu(LeftMenu.JOBOPENINGS);

	}
}
