package ashwini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 Find all the missing numbers between 1 to 10 from given List.

input : [9,7,6,2,1,5,3,10]
output : [4,8]
 */
public class Jan16Challenge3 {
	public static void main(String[] args) {
		Integer []arr= {9,7,6,2,1,5,3,10};
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		
		Set<Integer> numberSet = new HashSet<>();
		for (int i=1;i<=10;i++) {
			numberSet.add(i);
		}
		Set<Integer> num = new HashSet<>(al);
		numberSet.removeAll(num);
		System.out.println(numberSet);
	}

}
