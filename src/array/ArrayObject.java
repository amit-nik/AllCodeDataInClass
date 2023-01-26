package array;
public class ArrayObject {
	public static void main(String[] args) {
		Object a[] = {'A','x','j',5,7,10,"Amit","Amar","Akshay",10.5,20.5,55.5};
		
		System.out.println(a.length);
		System.out.println("*****************************");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+", ");		
	}
}
