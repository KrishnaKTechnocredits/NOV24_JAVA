package nilam.CollectionFrameWork.List;
import java.util.ArrayList;
import java.util.List;

//Find out all the duplicate elements from given arrayList and print them with their index.
public class Assignment_80 {

	static void getDuplicateNumOccurrence(List<Integer> numList) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> allIndex = new ArrayList<Integer>();

		for (int index = 0; index < numList.size(); index++) {
			int num = numList.get(index);
			if (numList.indexOf(num) != numList.lastIndexOf(num) && !numbers.contains(num)) {
				numbers.add(num);
				for (int j = 0; j < numList.size(); j++) {
					if (num == numList.get(j)) {
						allIndex.add(j);
					}
				}
				System.out.println(num + " is duplicate at indices " + allIndex);
			}
			allIndex.clear();
		}
	}

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(99);
		numList.add(10);
		numList.add(10);
		numList.add(77);
		numList.add(55);
		numList.add(46);
		numList.add(99);
		numList.add(99);

		getDuplicateNumOccurrence(numList);
	}
}
