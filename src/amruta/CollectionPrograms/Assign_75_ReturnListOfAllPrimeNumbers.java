/*
Assignment - 75 : 11th Jan
Return the list of all the prime numbers from given array. 
input : {10,23,31,40,50}
output : {23,31}
*/
package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class Assign_75_ReturnListOfAllPrimeNumbers {

	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	ArrayList<Integer> getPrimeNumbers(List<Integer> list) {
		int count = 0;
		for (int index = 0; index < list.size(); index++) {
			boolean flag = isPrimeNumber(list.get(index));
			if (flag) {
				count++;
			}
		}

		ArrayList<Integer> opList = new ArrayList<Integer>();

		for (int index = 0; index < list.size(); index++) {
			int num = list.get(index);
			boolean flag = isPrimeNumber(num);
			if (flag) {
				opList.add(num);
			}
		}
		return opList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		inputList.add(10);
		inputList.add(23);
		inputList.add(31);
		inputList.add(40);
		inputList.add(50);

		System.out.println("Given List -- " + inputList);
		System.out.println("");
		ArrayList<Integer> primeNumList = new Assign_75_ReturnListOfAllPrimeNumbers().getPrimeNumbers(inputList);
		System.out.println("List of Prime Numbers. -- \n" + primeNumList);
	}
}
