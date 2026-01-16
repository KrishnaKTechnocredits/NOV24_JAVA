package ashwini.interview;

//Important Program for interview 

	import java.util.Map;
	import java.util.Set;
	import java.util.TreeMap;

	public class FreqByCollections {

		void getAllCharFrequency(String word) {
			char[] arr = word.toCharArray();
			Map<Character, Integer> mapOfCharFreq = new TreeMap<Character, Integer>();

			for (char ch : arr) {
				if (mapOfCharFreq.containsKey(ch)) {
					int count = mapOfCharFreq.get(ch);
					mapOfCharFreq.put(ch, count + 1);
				} else {
					mapOfCharFreq.put(ch, 1);
				}
			}

			Set<Character> setOfKeys = mapOfCharFreq.keySet();
			int max = 0;
			char maxCh = ' ';

			for (char key : setOfKeys) {
				int value = mapOfCharFreq.get(key);
				System.out.println(key + "->" + value);

				if (max < value) {
					max = value;
					maxCh = key;
				}
			}
			System.out.println(maxCh + "-->" + max);
		}

		void getAllCharFrequency1(String word) {
			char[] arr = word.toCharArray();
			Map<Character, Integer> mapOfCharFreq = new TreeMap<Character, Integer>();

			for (char ch : arr) {
				if (mapOfCharFreq.containsKey(ch)) {
					int count = mapOfCharFreq.get(ch);
					mapOfCharFreq.put(ch, count + 1);
				} else {
					mapOfCharFreq.put(ch, 1);
				}
			}

			Set<Character> setOfKeys = mapOfCharFreq.keySet();
			int max = 0;
			
			for (char key : setOfKeys) {
				int value = mapOfCharFreq.get(key);
				System.out.println(key + "->" + value);

				if (max < value) {
					max = value;
				}
			}
			System.out.println(max);
			System.out.println("==============================");
			for(char key : setOfKeys) {
				int value = mapOfCharFreq.get(key);
				if(value == max) {
					System.out.println(key);
				}
			}
		}
		
		public static void main(String[] args) {
			String str = "aakankshakkakak";
			new FreqByCollections().getAllCharFrequency1(str);
		}
	}


