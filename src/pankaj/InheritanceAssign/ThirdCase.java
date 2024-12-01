package pankaj.InheritanceAssign;

//Case 3:- Created reference of parent class and called behavior of child class in case same methods counter.

public class ThirdCase {

	public static void main(String[] args) {
		
			Manager m=new Employee();    //Here we implemented the dynamic polymorphism.
			
			System.out.println(m.id);
			System.out.println(m.name);
		//	System.out.println(m.department);     
			
			m.M1();
			m.M2();
		//	m.M3();  

	}

}
