package prajaktaP.Opps_Assignment;

public class Assignment33 {
		void findCharFreqfromString(String str, char ab) {
			int frequency = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ab == ch) {
					frequency++;
				}
			}
			System.out.println("Frequency of char " + ab + " in a given string is " + frequency);
		}

		void findEachCharFreqInString(String str) {
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (index == str.indexOf(ch)) {
												
					findCharFreqfromString(str, ch);
				}
			}
		}

		void findCapitalCharFreq(String str) {
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (Character.isUpperCase(ch)) {
					if (index == str.indexOf(ch)) {
						findCharFreqfromString(str, ch);
					}
				}
			}
		}

		public static void main(String[] args) {
			Assignment33 assignment33 = new Assignment33();
			assignment33.findCapitalCharFreq("AABcBBBAdeddd");
		}
	}


