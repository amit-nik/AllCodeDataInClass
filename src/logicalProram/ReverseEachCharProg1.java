package logicalProram;

public class ReverseEachCharProg1 {

	public static void main(String[] args) {
		
		String str = "We Place With In One Month";
		String[] splitStr = str.split(" ");
		String revstr = "";
		String[] str1 = new String[6];
		char ch;
		for(int i = splitStr.length-1; i>=0; i--)
		{
			revstr = "";
			for(int j=splitStr[i].length()-1; j>=0; j--)
			{
				ch = splitStr[i].charAt(j);
				revstr = revstr+ch;			
			}
			str1[i] = revstr;
		}
		for(String value : str1)
		System.out.print(value + " ");
		
	}

}
