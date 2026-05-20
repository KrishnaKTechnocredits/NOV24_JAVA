/* * Assignment - 98 : 30th Jan'2025
 * 
 * Create a class called Connection and apply singleton design pattern.
 */

package amruta.CollectionPrograms;

public class Assign_98_SDP_LazyInstanciationConnection {

	private static Assign_98_SDP_LazyInstanciationConnection connection;

	private Assign_98_SDP_LazyInstanciationConnection() {
		System.out.println("Database Connection Established");
	}

	public static Assign_98_SDP_LazyInstanciationConnection getConnection() {
		if (connection == null) {
			synchronized (Assign_98_SDP_LazyInstanciationConnection.class) {
				if (connection == null) {
					connection = new Assign_98_SDP_LazyInstanciationConnection();
				}
			}
		}
		return connection;
	}
}