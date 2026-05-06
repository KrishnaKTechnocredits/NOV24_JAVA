//lazy initialization
package sindhu.singleton_dp;
public class LazySingletonConnection {
	private static LazySingletonConnection lazyCon;
	
	private LazySingletonConnection() {
		
	}
	
	public static LazySingletonConnection getObjectLazy() {
		if(lazyCon==null) {
			lazyCon = new LazySingletonConnection();
			return lazyCon ;
		}
		return lazyCon;
		
	}
	
	
}
