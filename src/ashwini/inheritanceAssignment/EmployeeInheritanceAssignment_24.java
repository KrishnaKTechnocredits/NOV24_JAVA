package ashwini.inheritanceAssignment;

public class EmployeeInheritanceAssignment_24 extends ManagerInheritanceAssignment24 {
	String empname="Sneha";
	int empSal=50000;
	void getEmpDetails() {
		System.out.println(" Employee Has 5 year of experience");
		System.out.println("Working on Banking domain in Axis bank under Deepika");
		}
	
	void getEmpPerDetails() {
		System.out.println("Employee Live in Pune");
		System.out.println("Employee's Hobby is reading books");	
	}
	
	public static void main(String[] args) {
		//Case 1=>
		System.out.println("Case 1...");
		ManagerInheritanceAssignment24 mng = new ManagerInheritanceAssignment24();
		System.out.println(mng.managerName);
		System.out.println(mng.managerSalary);
		mng.getMngDetails();
		mng.getMngPerDetails();
	//	mng.getEmpDetails(); //Parents class can not access the method of child class.(Compilation error) 
		
		//Case2==>
		System.out.println("Case 2...");
		EmployeeInheritanceAssignment_24 emp = new EmployeeInheritanceAssignment_24();
		System.out.println(emp.managerName);
		System.out.println(emp.managerSalary);
		System.out.println(emp.empname);
		System.out.println(emp.empSal);
		emp.getEmpDetails();
		emp.getEmpPerDetails();
		emp.getMngDetails();
		emp.getMngPerDetails();
		
		//case3==>
		System.out.println("Case 3...");
		ManagerInheritanceAssignment24 mng1 = new EmployeeInheritanceAssignment_24();
		System.out.println(mng1.managerName);
		System.out.println(mng1.managerSalary);
		//System.out.println(mng1.empname); [CE-it will  create object of employee class and assign it to manager class at run time. methods and variables not present in manager class gives COmpilation error]
		//System.out.println(mng1.empSal);
		//mng1.getEmpDetails();
		//mng1.getEmpPerDetails();
		mng1.getMngDetails();
		mng1.getMngPerDetails();
		
		//Case4==>
		System.out.println("Case 4...");
	    /*EmployeeInheritanceAssignment_24 emp1 = new ManagerInheritanceAssignment24(); //[CE we can not give manager class value to employee class need to type cast to do this]
		System.out.println(emp1.managerName);
		System.out.println(emp1.managerSalary);
		System.out.println(emp1.empname); 
		System.out.println(emp1.empSal);
		emp1.getEmpDetails();
		emp1.getEmpPerDetails();
		emp1.getMngDetails();
		emp1.getMngPerDetails();*/
		
		//Case 5==>
		System.out.println("Case 5...");
		ManagerInheritanceAssignment24 mng2 = new ManagerInheritanceAssignment24();
		EmployeeInheritanceAssignment_24 emp2= new EmployeeInheritanceAssignment_24();
		mng2=emp2;
		System.out.println(mng2.managerName);
		System.out.println(mng2.managerSalary);
		//System.out.println(mng2.empname); //[CE-it will  create object of employee class and assign it to manager class at run time. methods and variables not present in manager class gives COmpilation error]
		//System.out.println(mng2.empSal);
		//mng2.getEmpDetails();
		//mng2.getEmpPerDetails();
		mng2.getMngDetails();
		mng2.getMngPerDetails();
		
		//Case 6==>
		System.out.println("Case 6...");
		ManagerInheritanceAssignment24 mng3= new EmployeeInheritanceAssignment_24();
		EmployeeInheritanceAssignment_24 emp3 = new EmployeeInheritanceAssignment_24();
		emp3=(EmployeeInheritanceAssignment_24) mng3;
		System.out.println(emp3.managerName);
		System.out.println(emp3.managerSalary);
		System.out.println(emp3.empname); //[CE-it will  create object of employee class and assign it to manager class at run time. methods and variables not present in manager class gives COmpilation error]
		System.out.println(emp3.empSal);
		emp3.getEmpDetails();
		emp3.getEmpPerDetails();
		emp3.getMngDetails();
		emp3.getMngPerDetails();
		
	
	}

}
