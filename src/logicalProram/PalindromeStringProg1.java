package logicalProram;

public class PalindromeStringProg1 {

//	public static void main(String[] args) {
//
//		String str = "madam";
//		String revStr = "";
//
//		for(int i = 0; i<str.length(); i++)
//		{
//			char ch = str.charAt(i);
//			revStr = ch + revStr;
//		}
//		if(str.equals(revStr))
//			System.out.println("This Is Palindrome String = " + str);
//		else
//			System.out.println("This Is Not Palindrome String = " + str);
//	}public PalindromeStringProg1() {
//		// TODO Auto-generated constructor stub
//	}
	public static void main(String[] args) {


		int num = 153,sum = 0,temp;
		int num1 = 153;
		while(num>0){

			temp = num%10;
			sum = sum + temp*temp*temp;
			num = num/10;
		}
		System.out.println(sum);
		if(num1==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}
