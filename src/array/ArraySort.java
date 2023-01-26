package array;
import java.util.Arrays;
public class ArraySort {
//	Array sort 
	public static void main(String[] args) {

		int a[] = new int [5];
		a[0] = 300;
		a[1] = 100;
		a[2] = 200;
		a[3] = 500;
		a[4] = 400;
		
//		Array Print In Oriinal
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println("**********");
//		Array Sort And Print Ascending Order
		Arrays.sort(a);
		for(int i=0; i<a.length; i++)	
			System.out.print(a[i]+" ");
		System.out.println("********");
//		Array Sort And Print Dscending Order
		for(int i=a.length-1; i>=0; i--)	
			System.out.println(a[i]+" ");
		System.out.println("******");
//		String Sort
		String[] b = new String[5];
//		step2: array initialization
		b[0] = "Akshay";
		b[1] = "Amol";
		b[2] = "Tushar";
		b[3] = "Ganesh";
		b[4] = "Kartik";
//		Array Print Original
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
		System.out.println("********");
//		Array String Sort And Print Ascending Order
		Arrays.sort(b);
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
		System.out.println("********");
//		Array String Sort And Print Ascending Order
		for(int i=b.length-1; i>=0; i--)
			System.out.print(b[i]+" ");
	}
}
