//
//overloading
//
//-> Overloading always happen in a same class. 
//-> Method name must be same
//-> Parameters must be different, either number of paramerets or type of parameters or sequence of parameters must be different.
//
//   -> number of parameters must be different

//[Note if methd name and parameter is same  in same class then it will give there will be  duplicate method so parameter ,
//sequence of parametr and type of parameter must be diffrence
//-> Return type can be anything. 
package komal.Inheritance;

public class Overloading_method {

	void displayData() {
		System.out.println("Good morining");
	}

	int displayData(int a) {
		System.out.println("Good morining" + a);
		return 10;
	}

	public static void main(String args[]) {
		Overloading_method om = new Overloading_method();
		om.displayData();
		om.displayData(10);
	}

}
