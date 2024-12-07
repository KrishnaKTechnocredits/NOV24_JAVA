package ravindra;

public class AsciiOfA_Za_z0_9 {
	void asciiOfA_Z() {
		for(char a='A';a<='Z';a++) {
			int asciivalue=a;
			System.out.println(a+"-->"+asciivalue);
		}
	}
	
	void asciiOf_a_z() {
		for(char A='a';A<='z';A++) {
			int asciiValueOf_a_Z=A;
			System.out.println(A+"-->"+asciiValueOf_a_Z);
		}
	}
	
	void asciOf0_9() {
		for(char i='0';i<='9';i++) {
			int asciiValueOf_0_9=i;
			System.out.println(i+"-->"+asciiValueOf_0_9);
		}
	}
	public static void main(String[] args) {
		AsciiOfA_Za_z0_9 asciiOfA_Za_z0_9=new AsciiOfA_Za_z0_9();
		asciiOfA_Za_z0_9.asciiOfA_Z();
		asciiOfA_Za_z0_9.asciiOf_a_z();
		asciiOfA_Za_z0_9.asciOf0_9();
	}
}
