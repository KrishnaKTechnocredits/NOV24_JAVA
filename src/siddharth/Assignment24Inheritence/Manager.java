package siddharth.Assignment24Inheritence;

public class Manager {
	int id = 4567;
	public String name = "XYZ";

	void getId(){
		System.out.println("Manager ID is "+id);
	}

	public void getName() {
		System.out.println("Manager Name is "+name);
	}

	void getDepartmentName(String deptName) {
		System.out.println("Manager Department is "+deptName);
	}
}
