package array;

public class ArraysIntDeclaration {

	public static void main(String[] args) {
//		step1: array declaration
		int[] a = new int[5];
//		step2: array initialization
		a[0] = 100;
		a[1] = 500;
		a[2] = 600;
		a[3] = 400;
		a[4] = 700;
//		a[5] = 800;  //This Initialization not allow due to size of
//	Array is declare at the declaration time. If you initialized 
//	the we will give eception:- java.lang.ArrayIndexOutOfBoundsException.
		System.out.println(a[4]);
//		step3: array usage
		System.out.println(a[0]);     //100
		System.out.println(a.length); //5
//		step3: print all info from array
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("********");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
