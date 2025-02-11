package ashwini.singleton;

public class Assignment98 {

	public static void main(String[] args) {
		Connection connection1 = Connection.getObject();
		System.out.println(connection1);

		// Accessing the same instance again
		Connection connection2 = Connection.getObject();
		System.out.println(connection2);
		connection1.connect();
		connection2.connect();
	}

}
