package StarPatternProgram;

public class prog5 {

	public static void main(String[] args) {

		//    *
		//   ***
		//  *****
		// *******
		//*********
		
			int star = 1, space = 4, row = 5;
			
			for(int i = 1; i<=row; i++)
			{
				for(int j = 1; j<=space; j++)
				{
					System.out.print(" ");
				}
				for(int k = 1; k<=star; k++)
				{
					System.out.print("*");
				}
				System.out.println();
				star = star + 2;
				space = space - 1;
			}
		
	}

}
