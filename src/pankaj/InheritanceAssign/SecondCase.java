package pankaj.InheritanceAssign;

//Case 2:Creating the object and reference of child class only. 

public class SecondCase {

	public static void main(String[] args) {
		 
		Employee e=new Employee(); //Implemented static polymorphism
		
		System.out.println(e.id);
		System.out.println(e.name);
        System.out.println(e.department);
		
		e.M1();
		e.M2();
		e.M3();   
	}

}
