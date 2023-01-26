package array;

public class MultiDiementionalArray2 {

	public static void main(String[] args) {

		String[][] a = {{"Amit","Chitra","Deepali"},{"Amar","Kedare","Shrshti"}};
		
		System.out.println(a.length);
		System.out.println("*************************");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<=a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
