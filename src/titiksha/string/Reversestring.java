//Assignment - 19 : 24rd Nov'2024 [20 mins]
//Print all the characters of given string in reverse order. 
//input : te ch3no

package titiksha.string;

public class Reversestring {
	void getreversestring(String name){
		for(int index=name.length()-1;index>=0;index--) {
			System.out.println(name.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Reversestring reversestring=new Reversestring();
		reversestring.getreversestring("te ch3no");
        }
}
