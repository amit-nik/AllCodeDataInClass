package logicalProram;

public class EvenOddArrayProg1 {

	public static void main(String[] args) {

		int[] arr = {5,7,8,1,5,4,2,9,8,3,6,6,4,8};
		int countEven = 0,countOdd = 0;

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)	
			{
				countEven++;		
			}
		}
		System.out.println("Number Of Even Array = " + countEven);	
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]%2>0)	
			{
				countOdd++;
			}
		}
		System.out.println("Number Of Odd Array = " + countOdd);

	}

}
