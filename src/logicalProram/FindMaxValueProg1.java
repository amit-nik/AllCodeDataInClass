package logicalProram;

public class FindMaxValueProg1 {

	public static void main(String[] args) {

		int[] arr = {10,24,3,54,33,15};
		
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum value = " + max);
		
		int min = arr[0];
		for(int j = 0; j<arr.length; j++)
		{
			if(min>arr[j])
			{
				min = arr[j];
			}
		}
		System.out.println("Minimum value = " + min);
		
	}

}
