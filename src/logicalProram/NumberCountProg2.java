package logicalProram;

public class NumberCountProg2 {
	//	Find Total Number Of Even Or Odd Number
	public static void main(String[] args)
	{
		int num1 = 1578646475,count = 0,count1 = 0, temp;

		while(num1>0)
		{
			temp = num1%10;
			if(temp%2==0)
				count++;			
			else
				count1++;		
			num1 = num1/10;
		}
		System.out.println("Total Even Number = " + count);
		System.out.println("Total Odd Number = " + count1);
	}
}
