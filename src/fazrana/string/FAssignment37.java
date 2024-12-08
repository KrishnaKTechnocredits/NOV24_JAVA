//Assignment - 37 : 8th Dec [20 mins]
//write loop inside loop (nested for loop), and print frequency of each character. 
//
//input : aakanksha
//a->4
//k->2
//n->1
//s->1
//h->1
//10min
package fazrana.string;

public class FAssignment37 {
	void getFreq(String str) {
		for (int i=0;i< str.length();i++) {
			int count=0;
			char ch= str.charAt(i);
			if (str.indexOf(ch)==i) {
				for (int j=0; j< str.length();j++) {
					char chr= str.charAt(j);
					if (ch==chr) {
						count++;
					}
				}
				System.out.println(ch+"->>"+count);
			}
		}
	}
	
	public static void main(String[] args) {
		FAssignment37 fassignment37=new FAssignment37();
		fassignment37.getFreq("aakanksha");
	}
}
