package diyaK;
//create a class named example1 for employees, their name, age and salary should be printable.

public class Example1 {
  String firstname = "Diya";
  String lastname = "Kothari";
  int age = 21;
  int salary = 1000000;
  
  void displayInfo() {
	 System.out.println (firstname); 
	 System.out.println(lastname); 
	 System.out.println(age); 
	 System.out.println(salary); 
	  
  }
  public static void main (String[] args) {
	  Example1 e = new Example1();
	  e.displayInfo();
  }
  
}
