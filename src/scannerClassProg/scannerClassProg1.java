package scannerClassProg;

import java.util.Scanner;

public class scannerClassProg1 {

	public static void main(String[] args) {

		int num1,num2,sum;
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter The Two Number");
		num1 = a.nextInt();
		num2 = a.nextInt();
		sum = num1 + num2 ;
		System.out.println(sum);
		
	}

}
