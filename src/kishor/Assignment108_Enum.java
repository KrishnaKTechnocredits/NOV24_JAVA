package kishor;

public class Assignment108_Enum {
	
	enum LeftMenu{
		//we have created our user define variable type as LeftMenu 
		//spaces not allowed in enum varibale thats why we are using constructor
		DASHBOARD("Dashboard") , JOBOPENINGS("Job Openings") , 
		ASSESSMENTS("Assessments") , CANDIDATES("Candidates") , 
		INTERVIEWS("Interviews") , TALENTPOOL("Talent pool") ;
		
		private String value;
		
		//constructor
		LeftMenu(String value){
			this.value=value;
		}
		
		public String getValue() {
			return value;
		}
	}
	
	public void displayMenu(LeftMenu menu) {
		System.out.println(menu+"--->"+menu.getValue());
	}
	
	
	public static void main(String[] args) {
		Assignment108_Enum assignment108 = new Assignment108_Enum();
		//we cannot add string type here, we need to add user defined varibale
		assignment108.displayMenu(LeftMenu.DASHBOARD);
		assignment108.displayMenu(LeftMenu.JOBOPENINGS);
		assignment108.displayMenu(LeftMenu.ASSESSMENTS);
		assignment108.displayMenu(LeftMenu.CANDIDATES);
		assignment108.displayMenu(LeftMenu.INTERVIEWS);
		assignment108.displayMenu(LeftMenu.TALENTPOOL);
		
	}
}
