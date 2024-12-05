package rohan;

 class Manager {
	
	public int a = 10;
	int b = 15;
	
	void ManagerName() {
		System.out.println("Manger name is Hardik");
	}
	void MangerID() {
		System.out.println("Manger Id is 2255");
	}

}
 class Emplyee extends Manager {

	int b = 16;
	int c = 51;
	
	void MangerID() {
		System.out.println("Manger Id is 1122");
	}
	void empID() {
		System.out.println("EmpID is 969");
	}
	
}
 class Test {
		
		public static void main(String[] args) {
			
			//case 1:
			System.out.println("\n"+"Case1");
			Manager manager = new Manager();
			manager.ManagerName();
			manager. MangerID();
			System.out.println(manager.a);
			System.out.println(manager.b);
			
			//case 2:
			System.out.println("\n"+"Case2");
			Emplyee emplyee = new Emplyee();
			emplyee.ManagerName();
			emplyee.MangerID();
			emplyee.empID();
			System.out.println(emplyee.a);
			System.out.println(emplyee.b);
			System.out.println(emplyee.c);
			
			//case 3:
			System.out.println("\n"+"Case3");
			Manager manger = new Emplyee();
			System.out.println(manger.a);
			System.out.println(manger.b);
		//	System.out.println(manger.c);   CE 17
			manger.ManagerName();
			manger.MangerID();
		//	manger.empID();
			
			//case 4:
			System.out.println("\n"+"Case4");
		//	Emplyee emp = new Manager(); 	CE 
			
			//case 5:
			System.out.println("\n"+"Case5");
			Manager m = new Manager();
			Emplyee e = new Emplyee();
			m=e;
			System.out.println(m.a);
			System.out.println(m.b);
		//	System.out.println(m.c); //  CE 17
			m.ManagerName();
			m.MangerID();
		//	m.empID();
			
			//case 6:
			System.out.println("\n"+"Case6");
			Manager A = new Emplyee();
			Emplyee B = new Emplyee();
		 	B=(Emplyee)A;
			System.out.println(B.a);
			System.out.println(B.b);
			System.out.println(B.c);  
			B.ManagerName();
			B.MangerID();
			B.empID();
		}
		
	}

