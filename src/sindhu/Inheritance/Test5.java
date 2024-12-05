/*This scenario works similar to senario 3 (Dynamic polymorphism)
 * here reference type is Manager and object is Employee*/
package sindhu.Inheritance;

public class Test5 {
	public static void main(String[] args){
		Manager mngr = new Manager();
		Employee emp = new Employee();
		mngr = emp; //i.e. Manager mngr = new Employee();
		
		System.out.println(mngr.id);
		System.out.println(mngr.name);
		//System.out.println(mngr.departmentId);
		//System.out.println(mngr.departmentName);
		System.out.println(' ');
		mngr.getId();
		mngr.getName();
		mngr.getDepartmentName("IT");
		//mngr.getEmployeeDeptId();
		//mngr.getDepartmentName();
	}
}
