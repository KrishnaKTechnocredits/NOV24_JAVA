package pankaj.InheritanceAssign;

//Case 5:- Created object of parent and child and assigned reference variable to each other.
public class FifthCase {

	public static void main(String[] args) {

		
			Manager m =  new Manager();
			Employee e = new Employee();
			m=e;
			System.out.println(m.id);
			System.out.println(m.name);
		//	System.out.println(m.department); // This statament will not execute becasue of its not bound with Parent class.
			m.M1();
			m.M2();
		//	m.M3();                 // This statament will not execute becasue of its not bound with Parent class.

	}

}
