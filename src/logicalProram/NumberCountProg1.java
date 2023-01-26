package logicalProram;

public class NumberCountProg1 {

	public static void main(String[] args) {

		int num1 = 1578646475,count = 0;
		
		while(num1>0)
		{
			num1 = num1/10;
			count++;
		}
		System.out.println(count);
	}

}
