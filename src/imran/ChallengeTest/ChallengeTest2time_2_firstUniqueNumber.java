/*
 Find first Unique number from given list. 

input : [66,12,69,12,77,66,69,5,8,14]
output : First unique number is 77
 */

package imran.ChallengeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeTest2time_2_firstUniqueNumber {

	void getFirstUniqueNumber(List<Integer> data)
	{
		List<Integer> UniqueList = new ArrayList<Integer>();
		for(int i=0; i<data.size();i++)
		{
			int temp = data.get(i);
			int index = data.indexOf(temp);
			int lastindex = data.lastIndexOf(temp);
			if(index==lastindex)
			{
				UniqueList.add(temp);
			}
		}
		System.out.println(" The First Unique Number From the List is: "+ UniqueList.get(0));
	}
	public static void main(String[] args) {
		Integer[] input = {66,12,69,12,77,66,69,5,8,14};
		System.out.println(" The Given List is : " + Arrays.toString(input));
		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(input));
		ChallengeTest2time_2_firstUniqueNumber challengeTest2time_2_firstUniqueNumber_1 = new ChallengeTest2time_2_firstUniqueNumber();
		challengeTest2time_2_firstUniqueNumber_1.getFirstUniqueNumber(ls);
	}
}
