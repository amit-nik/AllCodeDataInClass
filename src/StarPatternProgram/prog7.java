package StarPatternProgram;

public class prog7 {

	public static void main(String[] args) {

		//*********
		// *******
		//  *****
		//   ***
		//    *
		
		int star = 9, space = 0, row = 5;
		
		for(int i = 1; i<=row; i++)
		{
			for(int k = 1; k<=space; k++)
			{
				System.out.print(" ");
			}
			for(int j = 1;j<=star; j++)
			{
				System.out.print("*");
			}		
			System.out.println();
			star = star - 2;
			space = space + 1;
		}
	}

}
