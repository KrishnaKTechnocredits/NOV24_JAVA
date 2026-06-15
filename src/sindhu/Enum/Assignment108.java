/*Create enum as LeftMenu, provide all options visible in the image. 
Create a method called displayMenu, based on given parameter print value of that option. 

Input : displayMenu(JOBOPENINGS);
output : JOBOPENINGS + "-->" + Job Openings*/

package sindhu.Enum;

public class Assignment108 {
	
	enum LeftMenu{
		DASHBOARD("Dashboard"),JOBOPENING("Job Openings"), 
		ASSESSMENT("Assessment"), CANDIDATES("Candidates"),
		INTERVIEWS("Interviews"), TALENTPOOL("Talent Pool");
		
		private String value;
		
		LeftMenu(String value){
			this.value = value;	
		}
		
		public String getValue(){
			return value;
		}
	}
	
	void navigateToMenu(LeftMenu menu){							
		//driver.findElement(By.xpath("span[text()='"+menu.getValue()+"']"));
	
		System.out.println(menu + " --> " + menu.getValue());
	}
}
