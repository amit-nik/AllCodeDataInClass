package StarPatternProgram;

public class prog4 {

	public static void main(String[] args) {

		//*
		//**
		//***
		//****
		//*****
		
		int star = 1, space = 4;
		int row = 5;
		
		for(int i = 1; i<=row; i++)
		{
			for(int j = 1; j<=star; j++)
			{
				System.out.print("*");
			}
			for(int k = 1; k<=space; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			star++;
			space--;
		}
		
	}

}
