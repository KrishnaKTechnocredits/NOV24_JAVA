package pankaj.InheritanceAssign;

//Case 1:Creating object and reference of the parent class only.
public class FirstCase {

	public static void main(String[] args)
	{
	
	  	
		Manager m=new Manager();              //Implemented static polymorphism
		System.out.println(m.id);
		System.out.println(m.name);
		//System.out.println(m.department);   //variable lies in child class
		
		m.M1();
		m.M2();
		//m.M3();                              //Method can not be accessible as we create object of parent class only
	}
}
	
	

				
	
	
		
		
		
		
		
	
		
	
		

	
	

