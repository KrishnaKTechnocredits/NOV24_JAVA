//Overriding : 
//-> Method overriding always happen between classes, where both classes are in the relationship
//  of parent and child. 
//-> to change the behavior of parent class method, we need method overriding concept. 
//-> method name must be same.
//-> number of parameters, type of parameters and sequence of parameters must be same.
//-> return type must be same
//-> access modifier must be equal or wider than parent class method. 

package komal.Inheritance;

public class Overriding {
	public static void main(String args[]) {
		child c = new child();
		String str = c.displayData();
		System.out.println(str);
	}
}

class parent {
	int a = 10;

	String displayData() {

		System.out.println(a);
		return "komal";
	}
}

class child extends parent {
	int a = 2;

	public String displayData() {
		System.out.println(a);
		return "khopade";
	}
}
