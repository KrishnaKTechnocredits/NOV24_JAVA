package rohan;

public class Assignment_28 {

	int AsciiValue(char first ,char last) {
		int num=0;
		for(char i= first ;i<=last;i++) {
			num = (int)i;
			System.out.println(i+" -> "+num);
		}
		return num;
	}
	char Character(int first, int last) {
		char ch=' ';
		for(int i=first ;i<=last;i++) {
			ch = (char)i;
			System.out.println(i+" -> "+ch);
		}
		return ch;
	}
	public static void main(String[] args) {
		Assignment_28 assignment = new Assignment_28();
		assignment.Character(65, 100);
		System.out.println("===========");
		assignment.AsciiValue('A', 'Z');
	}
}
