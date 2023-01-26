package logicalProram;

public class ArmStongNumberProg1 {

	public static void main(String[] args) {

		int num1 = 153,sum = 0;
		int num2 = 153;
		while(num1>0)
		{
			int temp = num1%10;
			sum = sum + temp*temp*temp;	
			num1 = num1/10;
		}
		System.out.println(sum);
		if(num2==sum)
			System.out.println("This Is Armstrong Number");
		else
			System.out.println("This Is Not Armstrong Number");
	}

}
