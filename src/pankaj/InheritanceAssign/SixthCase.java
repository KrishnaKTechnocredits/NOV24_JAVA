package pankaj.InheritanceAssign;

//Case 6:-Created objects of parent and child class and trying to assign the properties of child to parent.
public class SixthCase {

	public static void main(String[] args) {
		
		
				Manager m= new Employee();
				Employee e= new Employee();
				e=(Employee)m;           /*The statement will not be executed becasue 
											we can not place or assign parent type to child type thus we had used 
											explicit typecasting feature.
																		*/
				System.out.println(e.id);     
				System.out.println(e.name);
				System.out.println(e.department);
				e.M1();
				e.M2();
				e.M3();

	}

}
