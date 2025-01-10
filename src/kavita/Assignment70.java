package kavita;

/*Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";
output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5
Time:10m*/
public class Assignment70 {
	void printCountOfDigit(String str) {
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			String singleword = words[i];
				int count = 0;
				for (int j = 0; j < singleword.length(); j++) {
					if (Character.isDigit(singleword.charAt(j))) {
						count++;
					}
				}
				System.out.println(singleword + "--->" + count);
			}
		}
	

	public static void main(String[] args) {
		Assignment70 assignment70 = new Assignment70();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("Input string: " + str);
		System.out.println("..................");
		assignment70.printCountOfDigit(str);
	}
}
