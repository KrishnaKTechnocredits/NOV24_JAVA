package prajaktaP;

public class Managerr {
	    int mangerSalary = 100000;
	    int employeeSalary = 60000;

	    void managerName() {
	        System.out.println("Aniket");
	    }

	    void employeeName() {
	        System.out.println("Ram");
	    }
	}

	class Employ extends Manager {
	    int employeeSalary = 70000; // Shadows employeeSalary in Manager
	    int salary = 30000;

	    @Override
	    void employeeName() { // Overrides employeeName() in Manager
	        System.out.println("Ravindra");
	    }

	    void organisationName() {
	        System.out.println("techno");
	    }
	}

	class Test1 {
	    public static void main(String[] args) {
	        Manager m = new Manager();
	        System.out.println(m.mangerSalary);     // 100000
	        System.out.println(m.employeeSalary);  // 60000
	        // System.out.println(m.salary);        // Compile-time error: salary not in Manager class

	        m.managerName();                       
	        m.employeeName();                      
	        // m.organisationName();                
	    }
	}

	class Test2 {
	    public static void main(String[] args) {
	        Employ e = new Employ();
	        System.out.println(e.mangerSalary);    // 100000
	        System.out.println(e.employeeSalary); // 70000 (shadowed value from Employ)
	        System.out.println(e.salary);         // 30000

	        e.managerName();                      // Aniket
	        e.employeeName();                     // Ravindra (overridden method)
	        e.organisationName();                 // techno
	    }
	}

	class Test3 {
	    public static void main(String[] args) {
	        Manager m = new Employ();
	        System.out.println(m.mangerSalary);   // 100000 (from Manager)
	        System.out.println(m.employeeSalary); // 60000 (from Manager, not Employ)

	        m.managerName();                      // Aniket
	        m.employeeName();                     // Ravindra (runtime polymorphism)
	        // m.organisationName();               // Compile-time error: method not in Manager
	    }
	}

	class Test4 {
	    public static void main(String[] args) {
	        Manager m = new Manager();
	        Employ e = new Employ();
	        m = e; // Upcasting

	        System.out.println(m.mangerSalary);   // 100000 (from Manager)
	        System.out.println(m.employeeSalary); // 60000 (from Manager, not Employ)
	        // System.out.println(m.salary);       // Compile-time error: salary not in Manager

	        m.managerName();                      // Aniket
	        // m.organisationName();              // Compile-time error: method not in Manager
	    }
	}

	class Test5 {
	    public static void main(String[] args) {
	        // Employ m = new Manager(); // Compile-time error: Parent cannot be assigned to Child
	    }
	}

	class Test6 {
	    public static void main(String[] args) {
	        Manager m = new Employ(); // Upcasting
	        Employ e = new Employ();
	        // e = m; // Compile-time error: Downcasting requires explicit cast
	    }
	}


