package logicalProram;

public class ReverseNumberPog1 {

	public static void main(String[] args) {

		int num1 = 123456789,temp,sum = 0;
		
		while(num1>0)
		{
			temp = num1%10;
			sum = sum*10 + temp;
			num1 = num1/10;
		}
		System.out.println("Reverse Number = " + sum);
	}

}
