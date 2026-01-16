package diya;

class Employee{
	  String name="Diya Kothari";
	  int age = 21;
	  int salary = 800000;
	  
	  void displayinfo(){
	   System.out.println(name);
	   System.out.println(age);
	   System.out.println(salary);
	  }
	  public static void main(String[] args){
		 Employee e = new Employee ();
	     e.displayinfo ();	 
	  }
	 }