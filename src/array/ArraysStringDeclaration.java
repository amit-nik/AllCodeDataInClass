package array;

public class ArraysStringDeclaration {

	public static void main(String[] args) {
//		step1: array declaration
		String[] a = new String[5];
//		step2: array initialization
		a[0] = "Akshay";
		a[1] = "Amol";
		a[2] = "Tushar";
		a[3] = "Ganesh";
		a[4] = "Kartik";
//		a[5] = "Dipak";  //This Initialization not allow due to size of
//	Array is declare at the declaration time. If you initialized 
//	the we will give eception:- java.lang.ArrayIndexOutOfBoundsException.
		System.out.println(a[4]);
//		step3: array usage
		System.out.println(a[0]);     
		System.out.println(a.length); 
//		step3: print all info from array
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("**********");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
