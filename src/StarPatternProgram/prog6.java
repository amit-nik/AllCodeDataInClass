package StarPatternProgram;

public class prog6 {

	public static void main(String[] args) {

		//    *
		//   **
		//  ***
		// ****
		//*****
		
		int star=1,space=4, row = 5;
		
		for(int k=1;k<=row;k++)
		{
		for(int i=1;i<=space;i++)
		{
		System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		star++;
		space--;
		}
		
	}

}
