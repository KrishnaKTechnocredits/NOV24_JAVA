package sindhu.stringdemo;

public class CountLenWithoutSpace {
	static int count;
	static int spcnt;
	void getCharCountWithoutSpace(String str) {
		for(int i=0; i<=str.length()-1; i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}else {
				spcnt++;
			}
		}
	}
	
	public static void main(String[] args) {
		CountLenWithoutSpace countLenWithoutSpace = new CountLenWithoutSpace();
		countLenWithoutSpace.getCharCountWithoutSpace("I am From India");
		System.out.println("Total Letters in the string without spaces are "+count+" and spaces in the string are "+spcnt);
	}
}
