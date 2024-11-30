package nitish;

public class LastNum {
	
	int data(int start, int end) {
		int result;
		int count =0;
		for(result = end;result>=start;result--) {
			if(result%5==0) {
				count++;
			}
			if(count==1) {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		LastNum lastNum =new LastNum();
		int ans = lastNum.data(10,498);
			System.out.println("The last number which is divisible by 5 in the given range is "+ans);

	}

}
