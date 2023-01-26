package array;

public class ArraySingleStep {

	public static void main(String[] args) {

		int[] a = {100,200,100,300,400};
		
		System.out.println("Size of Array int = " +a.length);
//		print all info from int array
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]); 
		System.out.println("**************************");
		String[] b = {"Akshay","Amit","Bhole","Sudhir","Kartik"};
		
		System.out.println("Size of Array String = " +b.length);
//		print all info from int array
		for(int i=0; i<b.length; i++)
			System.out.println(b[i]); 
	
	}
}
