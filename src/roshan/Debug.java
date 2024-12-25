package roshan;


	public class Debug {
		static int[] arr = {};
		
		int[] getMaxMinNum(int[] input) {
			
			int[] output = new int[2];
			int maxNum = input[0], minNum = input[0];

			for (int index = 1; index < input.length; index++) {
				if (maxNum < input[index]) {
					maxNum = input[index];
				}

				if (input[index] < minNum) {
					minNum = input[index];
				}
			}
			output[0] = maxNum;
			output[1] = minNum;
			
			return output;
		}

		public static void main(String[] args) {
			System.out.println(arr.length); // 
			System.out.println(args.length); // 
			Debug ex3 = new Debug();
			int[] arr = {33,22,11,-55,-23,99,88,12};
			int[] maxMinArr = ex3.getMaxMinNum(arr);
			System.out.println("Max number is " + maxMinArr[0]);
			System.out.println("Min number is " + maxMinArr[1]);
			//System.out.println(Arrays.toString(maxMinArr));
		}
	}


