package nitish;

public class MiddleChar {
	
	void output() {
		String[] names = {"virat","Dhoni","Rohit","Raina","Karthik"};
		for(int i = 0;i<names.length;i++) {
			String names2 = names[i];
			int count = names2.length();
			char ch = names2.charAt((count-1)/2);
			System.out.println("The Middle Character in "+"'"+names2+"'"+" is ---> "+ch);
		}
	}

	public static void main(String[] args) {
		MiddleChar obj = new MiddleChar();
		obj.output();
	}

}
