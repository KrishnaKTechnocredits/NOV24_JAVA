// Same class possible scenarios:
//1-	NS method to S method calling- possible
//2-	S to NS calling with object creation possible
//3-	NS method to static variable calling-possible
//4-	S to NS variable calling with object creation possible
//5-	N to N method calling- possible
//6-	S to S method calling- possible
//7-	Static method calling non static variables -Static methods cannot have non static variables 


package titiksha.Static_Nonstatic;

public class Manager {
	public static int mno;
	public String mName;
	String department;
	int unit;

	public static void managerDetail() {
		mno = 1;
		Manager manager = new Manager();
		manager.manangerInfo();

		System.out.println(mno);

	}

	public void manangerInfo() {
		// managerDetail();
		department = "IT";
		mName = "Titiksha";
		unit = 1;
		System.out.println(department);
		System.out.println(unit);
		System.out.println(mno);
		System.out.println(mName);

	}
}
