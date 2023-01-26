package logicalProram;

public class ReverseNumByStringProg1 {

	public static void main(String[] args) {

		int num1 = 123456789;
		String strNum = Integer.toString(num1);
		String revStrNum = "";
		
		for(int i = 0; i<strNum.length(); i++)
		{
			char ch = strNum.charAt(i);
			revStrNum = ch + revStrNum;
		}
		System.out.println(revStrNum);
	}

}
