package ravindra;

public class FindCharCount {
	int charCount(String name, char x) {
		int count=0;
		for(int i=0;i<=name.length()-1;i++) {
			if(name.charAt(i)==x){
				count++;
			}
		}return count;
	}
	
	public static void main(String []args) {
		FindCharCount findCharCount=new FindCharCount();
		int num = findCharCount.charCount("aakanskha", 'a');
		System.out.println(num);		
	}
}
