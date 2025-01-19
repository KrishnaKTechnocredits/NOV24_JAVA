//Assignment - 71 : 5th Jan'2025 [IMP]
//
//return the word having highest digits in the given String .
//String str = "H2i22 H1ello Techno C2red3i3t4s5";
//
//output : C2red3i3t4s5

package fazrana.string;

public class FAssignment71 {
	int getNum(String str) {
		int count=0;
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	String getHighestValue(String str) {
		String[] array= str.split(" ");
		String final1="";
		int count=0;
		for (int i=0;i<array.length;i++) {
			if (getNum(array[i])>count){
				count=getNum(array[i]);
				final1=array[i];
			}
		} 
		return final1;
	}
	
	public static void main(String[] args) {
		String str="H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("Input: "+str);
		FAssignment71 fassignment71=new FAssignment71();
		System.out.println("Output: Highest value is "+fassignment71.getHighestValue(str));
	}
}
