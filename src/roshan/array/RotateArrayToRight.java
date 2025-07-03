package roshan.array;

import java.util.Arrays;

public class RotateArrayToRight {
	int[] rotateRight(int[] input) {
		int output[] = new int[input.length];
		output[0] = input[input.length - 1];
		for (int i = 0; i < input.length - 1; i++) {

			output[i + 1] = input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 40, 50 };
		RotateArrayToRight rotatearraytoright = new RotateArrayToRight();
		
		int[] result = rotatearraytoright.rotateRight(input);
		result = rotatearraytoright.rotateRight(result); // for second time rotation

		
		System.out.println(Arrays.toString(result));
	}

}

/*
 * Assignment - 74 : 8th Jan Rotate all the numbers of an array to the right by
 * one position. input : {10,20,30,40,50} output : {50,10,20,30,40};
 * {40,50,10,20,30}
 */