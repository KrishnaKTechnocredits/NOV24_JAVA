package titiksha;

public class Evennumber {
	void evenNumber(int startrange ,int endrange) {
		System.out.println("Below numbers are even numbers");
		for(int num =startrange;num <= endrange;num++) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args) {
		Evennumber evennumber=new Evennumber();
		evennumber.evenNumber(10,15);
	}
}
