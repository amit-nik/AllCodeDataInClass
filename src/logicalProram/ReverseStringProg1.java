package logicalProram;

public class ReverseStringProg1 {

	public static void main(String[] args) {

		String str = "amitTambe";
		String revStr = "";
		
		for(int i = 0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			revStr = ch + revStr;
		}
		System.out.println(revStr);
	}

}
