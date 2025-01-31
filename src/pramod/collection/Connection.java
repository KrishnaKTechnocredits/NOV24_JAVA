package pramod.collection;

public class Connection {

	private static Connection con; //Lazy initialization.
		
	private Connection() {

	}

	public static Connection getConnection() {
		if (con == null) {
			con = new Connection();
		}
		return con;
	}
	
	/* Code for Eager initialization
	private static Connection con = new Connection();
	private Connection() {

	}

	public static Connection getConnection() {
		
		return con;
	}
	 */
}
