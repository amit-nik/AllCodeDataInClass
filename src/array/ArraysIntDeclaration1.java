package array;

public class ArraysIntDeclaration1 {
//	Print Int And String Array in Reverse Order
	public static void main(String[] args) {

//		step1: array declaration
		int[] a = new int[5];
//		step2: array initialization
		a[0] = 100;
		a[1] = 500;
		a[2] = 600;
		a[3] = 400;
		a[4] = 700;
		
		for(int i=4; i>=0; i--)
			System.out.println(a[i]);
		
		System.out.println("++++++++++++++++++");
//		step1: array declaration
		String[] b = new String[5];
//		step2: array initialization
		b[0] = "Akshay";
		b[1] = "Amol";
		b[2] = "Tushar";
		b[3] = "Ganesh";
		b[4] = "Kartik";
		for(int i=b.length-1; i>=0; i--)
			System.out.println(b[i]);
	}
}
