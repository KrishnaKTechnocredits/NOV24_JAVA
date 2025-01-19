/*
 * Find all the missing numbers between 1 to 10 from given List.

input : [9,7,6,2,1,5,3,10]
output : [4,8]
 */

package imran.ChallengeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeTest2time_3_MissingNumber {

	void getMissingNumber(List<Integer> data)
	{
		List<Integer> ls = new ArrayList<Integer>(data);
		List<Integer> misnumber = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			int temp=i;
			if(!ls.contains(temp))
			{
				misnumber.add(temp);
			}
		}
		System.out.println("The Missing number in the List is " + misnumber);
	}
	public static void main(String[] args) {
		ChallengeTest2time_3_MissingNumber challengeTest2time_3_MissingNumber_1 = new ChallengeTest2time_3_MissingNumber();
		Integer[] input = {9,7,6,2,1,5,3,10};
		System.out.println(" The Given List is : " + Arrays.toString(input));
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(input));
		challengeTest2time_3_MissingNumber_1.getMissingNumber(ls);
	}
}
