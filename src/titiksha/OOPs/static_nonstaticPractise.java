package titiksha.OOPs;

import titiksha.Static_Nonstatic.Manager;

public class static_nonstaticPractise {
	static int Eno;
	String EName;
	String department;
	int unit;

	static void EmployeeDetail() {
		Eno = 1;
		Manager manager = new Manager();
		manager.manangerInfo();
		Manager.managerDetail();
		System.out.println(Eno);

	}

	void EmployeeInfo() {
		Manager.managerDetail();
		Manager.managerDetail();
		department = "IT";
		Manager manager = new Manager();
		manager.manangerInfo();
		unit = 1;
		//System.out.println(manager.mName);
		//System.out.println(Manager.mno);
		System.out.println(Eno);

	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		//System.out.println(manager.mName);
		// EmployeeSDetail();
		Manager.managerDetail();
		manager.manangerInfo();
		manager.manangerInfo();
	}
}


