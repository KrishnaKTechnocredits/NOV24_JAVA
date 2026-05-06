
//Assignment - 98 : 30th Jan'2025
//Create a class called Connection and apply singleton design pattern.
package fazrana.singleTonDesignPattern;

public class FAssignment98 {
//	private static FAssignment98 object = new FAssignment98();
	private static FAssignment98 object = null;

	private FAssignment98() {

	}

	static FAssignment98 getObject() {
		if (object == null) {
			object = new FAssignment98();
		}
		return object;
	}
	
//	static FAssignment98 getObject() {
//		return object;
//	}
}
