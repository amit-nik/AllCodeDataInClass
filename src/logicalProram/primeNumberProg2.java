package logicalProram;

public class primeNumberProg2 {

	public static void main(String[] args) {

		
		for(int num=1; num<=100; num++)
		{	
			int count = 0;
			if(num>0)
			{
				for(int j=2; j<num; j++)
				{
					if(num%j==0)
					{
						count++;
						break;
					}
				}
				
			}
			if(count==0)
				System.out.println("Number Is Prime = " + num);
			
		}
	}
}
