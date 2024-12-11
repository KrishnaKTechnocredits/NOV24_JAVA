package ravindra;

public class PrintTotolNoOfDigitAndCount {
	int countFreq(String name,char ch) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(c==ch) {
				count++;
			}
		}return count;
	}
	
	void frequancy(String name) {
		for(int index=0;index<name.length();index++) {
			char chars=name.charAt(index);
			int indexofchars=name.indexOf(chars);
			if(index==indexofchars) {
				int printcharCount=countFreq(name,chars);
				System.out.println(chars+"-->"+printcharCount);
			}
		}
	}
	
	public static void main(String[] args) {
		String name="aakansha";
		PrintTotolNoOfDigitAndCount printTotolNoOfDigitAndCount=new PrintTotolNoOfDigitAndCount();
		printTotolNoOfDigitAndCount.frequancy(name);
	}
}
