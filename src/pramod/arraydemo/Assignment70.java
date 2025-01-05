/*

Assignment - 70 : 5th Jan'2025 [IMP] [10 mins]

Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5
*/
package pramod.arraydemo;
class Assignment70{
	
	int getCountOfDigit(String word){
		int count= 0;
		for(int i = 0; i<word.length(); i++){
			char ch = word.charAt(i);
			if(Character.isDigit(ch)){
				count++;
			}
		}
		return count;
		
	}

	void printCountOfDigitInEachWord(String str){
		String[] words = str.split(" ");
		
		for (int i=0; i<words.length;i++){
			String word = words[i];
			int count = getCountOfDigit(word);
			System.out.println(word + " -> " + count);
		}
	}

	public static void main(String[] args){
		Assignment70 A70=new Assignment70();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("Given String is: "+str);
		A70.printCountOfDigitInEachWord(str);
	}
}