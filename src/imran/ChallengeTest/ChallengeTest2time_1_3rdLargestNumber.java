/*
 * Find out the 3rd largest number from given list.

Input : [55,44,55,12,99,99,36,24,8,23]
output : 44
 */

package imran.ChallengeTest;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.*;

public class ChallengeTest2time_1_3rdLargestNumber {

	void get3rsLargestNumber(List<Integer> data)
	{
		Set<Integer> sortedSet = new TreeSet<Integer>(data);
		List<Integer> sortedList = new ArrayList<Integer>(sortedSet);
		System.out.println(" The Third Largest Number From List is : " + sortedList.get(sortedList.size()-3));
	}
	public static void main(String[] args) {
		ChallengeTest2time_1_3rdLargestNumber challengeTest2time_1_3rdLargestNumber_1 = new ChallengeTest2time_1_3rdLargestNumber();
		Integer[] input = {55,44,55,12,99,99,36,24,8,23};
		System.out.println(" The Given List is : " + Arrays.toString(input));
		List<Integer> inputList= new ArrayList<Integer>(Arrays.asList(input));
		challengeTest2time_1_3rdLargestNumber_1.get3rsLargestNumber(inputList);
		
	}
}
