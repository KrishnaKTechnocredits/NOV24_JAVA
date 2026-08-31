package harish.singleton;

/**
 * Assignment - 98 : 30th Jan'2025
 * 
 * Create a class called Connection and apply singleton design pattern.
 */

//Approach 2 - Eager Initialization

public class A98_ConnectionEagerInitialization {

	private static final A98_ConnectionEagerInitialization instance = new A98_ConnectionEagerInitialization();

	private A98_ConnectionEagerInitialization() {
		System.out.println("Database Connection Established");
	}

	public static A98_ConnectionEagerInitialization getInstance() {
		return instance;
	}
}
