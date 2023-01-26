package logicalProram;

public class primeNumberPro1 {

	public static void main(String[] args) {
		// Find the number is prime or not
		
		int num = 15,count = 0;
		
		if(num>0)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==1)
				System.out.println("Number is not prime = " + num);
			else
				System.out.println("Number is prime = " + num);
		}
		
	}

}
