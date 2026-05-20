/*
 * Assignment - 98 : 30th Jan'2025
 * 
 * Create a class called Connection and apply singleton design pattern.
 */

package amruta.CollectionPrograms;

public class Assign_98_SDP_EarlyOrEagerInitializationConnection {

	private static final Assign_98_SDP_EarlyOrEagerInitializationConnection instance = new Assign_98_SDP_EarlyOrEagerInitializationConnection();

	private Assign_98_SDP_EarlyOrEagerInitializationConnection() {
		System.out.println("Database Connection Established");
	}

	public static Assign_98_SDP_EarlyOrEagerInitializationConnection getInstance() {
		return instance;
	}
}