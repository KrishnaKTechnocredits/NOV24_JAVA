// eager initialization

package sindhu.singleton_dp;

public class SingletonConnection {
	// 
	private static SingletonConnection con = new SingletonConnection();
	
	private SingletonConnection(){
	}
	
	public static SingletonConnection getObject() {
		return con;
	}
	
}
