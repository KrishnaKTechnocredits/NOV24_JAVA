/*Assignment - 43 : 8th Dec[10 mins]
write a logic to print below pattern.
 */
package nitesh.nestedloop;

public class CharacterPatern  {

	 
	void printCharPatern() {
		char ch = 'A';
		for(int i=1;i<=4;i++) {
			for(char j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		CharacterPatern characterpatern = new CharacterPatern();
		characterpatern.printCharPatern();
	}
}
