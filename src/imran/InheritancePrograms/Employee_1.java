package imran.InheritancePrograms;

public class Employee_1 extends Manager_1{

	int a=12, b=20, c=39, z;
	
	void m2()
	{
		System.out.println("This is Employee_1 class m2 Method");
	}
	void m3()
	{
		z=a+b+c;
		System.out.println("Addition done by employee class (Child Class) is "+ z);
	}
}
