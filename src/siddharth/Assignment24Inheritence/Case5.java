package siddharth.Assignment24Inheritence;

public class Case5 {
	public static void main(String[] args){
		Manager mngr = new Manager();
		Employee emp = new Employee();
		mngr = emp; // Manager mngr = new Employee();

		System.out.println(mngr.id);
		System.out.println(mngr.name);
		//System.out.println(mngr.departmentId);
		//System.out.println(mngr.departmentName);
		System.out.println(' ');
		mngr.getId();
		mngr.getName();
		mngr.getDepartmentName("QA");
		//mngr.getEmployeeDeptId();
		//mngr.getDepartmentName();
	}
}
