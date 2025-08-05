package harish.singleton;

/**
 * Assignment - 98 : 30th Jan'2025
 * 
 * Create a class called Connection and apply singleton design pattern.
 */

//Approach 1 - Lazy Initialization

public class A98_ConnectionLazyInitialization {

	// Private static variable to hold the single instance
	private static A98_ConnectionLazyInitialization connection;

	// Private constructor to prevent instantiation
	private A98_ConnectionLazyInitialization() {
		System.out.println("Database Connection Established");
	}

	// Public method to provide access to the instance
	public static A98_ConnectionLazyInitialization getConnection() {
		if (connection == null) {
			synchronized (A98_ConnectionLazyInitialization.class) {
				if (connection == null) { // Double-checked locking, helpful in multi-threaded environment
					connection = new A98_ConnectionLazyInitialization();
				}
			}
		}
		return connection;
	}
}