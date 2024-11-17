package PankajP;


class Example16{
		
	static int x = 10;
		int y = 20;
		
		void changeValue(){
			x++; // post increment statement
			y++;
		}
		
		void display(){
			int temp = 10;
			System.out.println(x);
			System.out.println(y);
		}
		
		public static void main(String[] args){
			Example16 example16_1 = new Example16();
			example16_1.changeValue();
			example16_1.changeValue();
			example16_1.display();
			
			Example16 example16_2 = new Example16();
			example16_2.changeValue();
			example16_2.display();
		}
	}


