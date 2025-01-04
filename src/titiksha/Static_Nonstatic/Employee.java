//Different class possible scenarios:
//8-	NS method to S method calling- with class name possible
//9-	S to NS callingobject creation needed.
//10-	NS to static variable calling with class name possible
//11-	S to NS variable calling- object creation needed
//12-	N to N method calling with class name possible
//13-	S to S method calling- with class name possible

package titiksha.Static_Nonstatic;

public class Employee {
	static int Eno;
	String EName;
	String department;
	int unit;

	static void EmployeeDetail() {
		Eno = 1;
		Manager manager = new Manager();
		manager.manangerInfo();
		System.out.println(Eno);

	}

	void EmployeeInfo() {
		Manager.managerDetail();
		department = "IT";

		unit = 1;
		System.out.println(department);
		System.out.println(Manager.mno);
		System.out.println(Eno);

	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager.mName);
		// EmployeeSDetail();
		Manager.managerDetail();
		// manager.manangerInfo();
		// manager.manangerInfo();
	}
}
