package titiksha.Returntype;

public class Practise1 {
	String processData(int num) {
		int ans = 10;
		ans = ans + num;
		if (ans > 50) {
			return "Hi";
		} else {
			System.out.println("Hello");
		}
		System.out.println("1");
		return "Techno";
	}

	public static void main(String[] args) {
		Practise1 practise1 = new Practise1();
		String ans = practise1.processData(10);
		System.out.println(ans);
	}
}
