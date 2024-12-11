//print table for 1 to 5 numbers.
// 2*1=2

package titiksha.NestedLoop_Patternprinting;

public class Printtable {
	void gettable(int startrange, int endrange) {

		for (int i = 1; i <= 5; i++) {
			for (int j = startrange; j <= endrange; j++) {
				int multiple = i * j;
				System.out.println(i + "*" + j + "=" + multiple);
			}
			System.out.println("........................");
		}
	}

	public static void main(String[] args) {
		Printtable printtable = new Printtable();
		printtable.gettable(1, 10);
	}
}
