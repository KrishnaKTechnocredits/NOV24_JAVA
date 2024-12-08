package ravindra;

public class PrintFrequencyOfUpeercaseCharecter {
	int Count(String name,char ch) {
		int UppercaseCount=0;
		for(int i=0;i<name.length();i++) {
			char charecter=name.charAt(i);
			if(charecter==ch) {
				if(Character.isUpperCase(charecter)) {
				UppercaseCount++;
				}
			}
		}return UppercaseCount;
	}
	
	void characterFrequency(String name) {
		for(int i=0;i<name.length();i++) {
			char chars = name.charAt(i);
			int indexchar = name.indexOf(chars);
			if(Character.isUpperCase(chars)&& i==indexchar) {
				int returncharCount=Count(name,chars);
				System.out.println(chars+"-->"+returncharCount);
			}
		}
	}
	
	public static void main(String[] args) {
		String name="AABcBBBAdeddd";
		PrintFrequencyOfUpeercaseCharecter printFrequencyOfUpeercaseCharecter =new PrintFrequencyOfUpeercaseCharecter();
		printFrequencyOfUpeercaseCharecter.characterFrequency(name);
	}
}
