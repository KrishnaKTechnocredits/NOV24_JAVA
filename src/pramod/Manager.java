/*
Assignment - 24 : 29th Nov'2024

Create 2 classes, Manager and Employee with 2 variables and 2 methods in each class,
and perform all 6 cases of inheritance.
*/
package pramod;
class Manager extends Employee{
	
	static int x=11;
	int y=10;
	
	void m1() {
		System.out.println("Manager m1");
	}
	
	void m2() {
		System.out.println("Manager m2");
	}
	
	static void m3() {
		System.out.println("Static Manager m3");
	}
	
	public static void main(String[] args) {
		System.out.println("CASE 1 Parent Refrence Parent Object");
		Employee e = new Employee();
		System.out.println("Static Employee "+a);
		System.out.println("Employee "+e.b);
		e.e1();
		e.e2();
		e3();
		
		System.out.println("Static Manager "+Manager.x);
		Manager.m3();
		
		System.out.println();
		System.out.println("CASE 2 Child Reference Child Object ");
		Manager m= new Manager();
		System.out.println("Static Manager "+x);
		System.out.println("Manager "+m.y);
		m.m1();
		m.m2();
		Manager.m3();
		
		System.out.println("Static Employee "+a);
		System.out.println("Employee "+m.b);
		m.e1();
		m.e2();
		e3();
		
		System.out.println();
		System.out.println("CASE 3 Parent Reference Child Object ");
		Employee emp3 = new Manager();
		
		System.out.println("Static Employee "+a);
		System.out.println("Employee "+emp3.b);
		emp3.e1();
		emp3.e2();
		e3();
		
		System.out.println("Static Manager "+Manager.x);
		Manager.m3();
		
		System.out.println();
		System.out.println("CASE 4 Child Reference Parent Object ");
		//Manager mng = new Employee();  
		System.out.println("Getting error as => incompatible types: Employee cannot be converted to Manager");
		
		System.out.println();
		System.out.println("CASE 5 Parent Reference Parent Object and child Refrence child Object then assigning child object to parent ");
		Employee emp5 = new Employee(); //parent
		Manager mng5 = new Manager();   //child
		emp5=mng5;
		
		System.out.println("Static Employee "+a);
		System.out.println("Employee "+emp5.b);
		emp5.e1();
		emp5.e2();
		e3();
		
		System.out.println("Static Manager "+Manager.x);
		Manager.m3();
		
		System.out.println();
		System.out.println("CASE 6 Parent Reference Parent Object and child Refrence child Object then assigning parent object to child ");
		/*Employee emp6 = new Employee();
		Manager mng6 = new Manager();
		mng6=emp6; */
		System.out.println("Getting error as => incompatible types: Employee cannot be converted to Manager");
	}
}	