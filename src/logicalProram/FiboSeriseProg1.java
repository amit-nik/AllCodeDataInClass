package logicalProram;

public class FiboSeriseProg1 {

	public static void main(String[]args)
	//	{
//			
	//		//1 1 2 3 5 8 13
	//		
	//		int num1 = 0, num2 = 1, sum;
	//		for(int i = 1; i <= 10; i++) {
	//			sum = num1+num2;
	//			System.out.print(sum + " ");
	//			num1 = num2;
	//			num2 = sum;			
	//		}

	{		
//		prime number series
		for(int i = 1; i<=100;i++) 
		{
			int counter=0;

			if(i>0) 
			{
				for(int num=2; num<i;num++) 
				{
					if(i%num==0)
					{
						counter++;
						break;
					}
				}

			}
		
			if (counter ==0)
				System.out.println("prime = " + i);
		}
	}
}

	

