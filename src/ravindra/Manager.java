package ravindra;

class Manager {
	int mangerSalary=100000;
	int employeeSalary=60000;
	
	void managerName() {
		System.out.println("Aniket");
		}
	
	void employeeName() {
		System.out.println("Ram");
	}
}

class Employ extends Manager{
	int employeeSalary=70000;
	int salary=30000;
	
	void employeeName() {
		System.out.println("Ravindra");
	}
	
	void orgnisationName() {
		System.out.println("techno");
	}
}

class Test1{
	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println(m.mangerSalary);			//100000
		System.out.println(m.employeeSalary);		//60000
//		System.out.println(m.salary);          	show compile Time Error because variable salary is not present in manager class
		
		m.managerName();						//Aniket
		m.employeeName();						//Ram
//		m.orgnisationName();					show compile Time Error because method orgnisationName is not present in manager class
	}
}

class Test2{
	public static void main(String[] args) {
		Employ e=new Employ();
		System.out.println(e.mangerSalary);  	//100000
		System.out.println(e.employeeSalary);	//70000
		System.out.println(e.salary);          	//30000
		
		e.managerName();						//Aniket
		e.employeeName();						//Ravindra
		e.orgnisationName();					//techno
	}
}

class Test3{
	public static void main(String[] args) {
		Manager m=new Employ();
		System.out.println(m.mangerSalary);  	//100000
		System.out.println(m.employeeSalary);	//60000
//		System.out.println(m.salary);          	Compile time Error because the variable is not present in manager class so he don't take guarantee that variable 
		
		m.managerName();						//Aniket
		m.employeeName();						//Ravindra
//		m.orgnisationName();					//Compile Time Error Because the method is not present in manager class so he don't take guarantee that method
	}
}

class Test4{
	public static void main(String[] args) {
		Manager m=new Manager();
		Employ e=new Employ();
		m=e;
		System.out.println(m.mangerSalary);  	//100000
		System.out.println(m.employeeSalary);	//60000
//		System.out.println(m.salary);          	//Compile time Error because the variable is not present in manager class so he don't take guarantee that variable
		
		m.managerName();						//Aniket
//		m.orgnisationName();					//Compile Time Error Because the method is not present in manager class so he don't take guarantee that method
	}
}

class Test5{
	public static void main(String[] args) {
	//	Employ m=new Manager();		Show compile Time Error here we trying assign parent value to child class.
	}
}

class Test6{
	public static void main(String[] args) {
		Manager m=new Employ();
		Employ e=new Employ();
//		e=m;						//Compile Time Error Because compiler check the reference type so it is mismatch 
	}
}