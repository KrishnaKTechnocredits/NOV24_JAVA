package sindhu.Inheritance;

public class Test1 {
	public static void main(String[] args){
		Manager mngr = new Manager();
		mngr.getId();
		mngr.getName();
		mngr.getDepartmentName("IT");
		
		
/* Compilation error for below as object of employee class (child) 
 * is not created, so we can not access its members and properties.
 */
		//System.out.println(mngr.departmentId);
		//System.out.println(mngr.departmentName);
		//mngr.getEmployeeDeptId();
		//mngr.getDepartmentName();
	}
}
