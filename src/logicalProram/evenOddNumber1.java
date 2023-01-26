package logicalProram;

import java.util.Scanner;

public class evenOddNumber1 {

	public static void main(String[] args) {

		int num1;
		System.out.println("Enter the Number");
		Scanner a = new Scanner(System.in);
		num1 = a.nextInt();
		
		if(num1%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		
		
		
	}

}
