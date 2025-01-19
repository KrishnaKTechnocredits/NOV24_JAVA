package nilam.loop;

public class Assignment13_loop {
	
	void disply(int start, int end) {
		int count=0;
		int startnum=start;
		for(;start<=end;start++) {
			if (start%3==0 && start%5==0) {
				count++;
				System.out.println(start);
			}
		}
		System.out.println("Numaber divible by 5 and 3");
		System.out.println("Between range " +startnum+ " to " +end+ ", there are total " +count+ " numbers which are div by 3 and 5");
	}
	
	public static void main(String[] args) {
		Assignment13_loop assignment13_loop= new Assignment13_loop();
		assignment13_loop.disply(5, 40);
	}
}
