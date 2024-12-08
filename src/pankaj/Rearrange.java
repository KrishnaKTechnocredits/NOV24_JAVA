package pankaj;

public class Rearrange {
	
	
		int ucount,lcount,dcount;
		void processData(String str)
		{
			
			for(int i=0; i<=str.length()-1;i++)
			{
				char ch=str.charAt(i);
				boolean flag=Character.isLetter(ch);
				
				if(flag==true)
				{
					
					if(Character.isUpperCase(ch))
					{
						//uCount++;
						System.out.print(ch);
						ucount++;
					}
					else if(Character.isLowerCase(ch))
					{
						//lCount++;
						System.out.print(ch);
					}
				}
				else if(Character.isDigit(ch))
				{
					//dCount++;
				//	System.out.print(ch);
					
				
				}
			//	System.out.println(Character.isUpperCase(ch)+""+Character.isLowerCase(ch)+""+Character.isDigit(ch));
			}
			
		
		
		}	
		public static void main(String[] args)
		{
			
					Rearrange r=new Rearrange();
					r.processData("TeCHNoc33r44editS");
		}
	}
