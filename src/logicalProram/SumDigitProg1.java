package logicalProram;

public class SumDigitProg1 {

	public static void main(String[] args) {

		int num1 = 123456789,temp,sum = 0;
		
		while(num1>0)
		{
			temp = num1%10;
			sum = sum + temp;
			num1 = num1/10;		
		}
		System.out.println("Sum of All Digit = " + sum);
	}

}
