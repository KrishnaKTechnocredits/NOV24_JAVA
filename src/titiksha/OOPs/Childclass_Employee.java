package titiksha.OOPs;

public class Childclass_Employee extends Inheritance {
	String name = "Goel";
	int managerid = 101;
	String phonenumber = "91-8744007324";

	void employename() {
		System.out.println(name);
		System.out.println(phonenumber);
	}

	void managerId() {
		System.out.println(managerid);
	}

	public static void main(String[] args) {
		System.out.print("\n" + "Case1-creating object of parent class" + "\n");
		// Case1:
		Inheritance inheritance = new Inheritance();
		inheritance.manager();// titiksha
		inheritance.managerId();// 1684386

		// case2:
		System.out.print("\n" + "Case2-creating object of child class" + "\n");
		Childclass_Employee childclass = new Childclass_Employee();
		childclass.manager();// titiksha
		childclass.managerId();// 101
		childclass.employename();// goel and phonenumber

		// case3:dynamic polymorphism
		System.out.print("\n" + "Case2-creating object of child class but giving refernce of parentclass" + "\n");
		Inheritance inheritance1 = new Childclass_Employee();
		inheritance1.managerId();// 101
		inheritance1.manager();// titiksha
		
	}
}
