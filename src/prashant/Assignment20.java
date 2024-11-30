 /*Assignment - 20 : 24th Nov'2024 [20 mins] [IMP]
Find the given character count from given string. 

input : aakanskha, a
output : Count of a in aakanskha is 4.  		 

hint : 
int getCharFreq(String str, char ch){
     return count;
}*/

	package prashant;

	public class Assignment20 {

		int getCharFreq(String input, char ch) {
			int count = 0;
			for (int index = 0; index < input.length(); index++) {
				char temp = input.charAt(index);
				if (temp == ch) {
					count++;
				}

			}

			return count;

		}

		public static void main(String[] args) {
			Assignment20 assignment20 = new Assignment20();
			int finalcount = assignment20.getCharFreq("aakanskha", 'a');
			System.out.println("Count of a in aakanskha is-: " + finalcount);

		}

	}
