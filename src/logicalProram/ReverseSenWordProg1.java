package logicalProram;

public class ReverseSenWordProg1 {
	
	public static void main(String[] args) {
		
		String str = "We Place With In One Month";
		String[] arr = str.split(" ");
		String revStr = "";

		for(int i = arr.length-1; i>=0; i--)
		{
//			revStr = revStr + arr[i];
			System.out.print(arr[i] + " ");
		}
//		System.out.println(revStr + " ");
	}
	
}
