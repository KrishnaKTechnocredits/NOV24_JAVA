package ravindra;

public class AsciiOfA_Za_z0_9 {
	void asciiOfA_Z() {
		for(char a='A';a<='Z';a++) {
			int AZ=a;
			System.out.println(a+"-->"+AZ);
		}
	}
	
	void asciiOf_a_z() {
		for(char A='a';A<='z';A++) {
			int az=A;
			System.out.println(A+"-->"+az);
		}
	}
	
	void asciOf0_9() {
		for(char i='0';i<='9';i++) {
			int a=i;
			System.out.println(i+"-->"+a);
		}
	}
	public static void main(String[] args) {
		AsciiOfA_Za_z0_9 all=new AsciiOfA_Za_z0_9();
		all.asciiOfA_Z();
		all.asciiOf_a_z();
		all.asciOf0_9();
	}
}
