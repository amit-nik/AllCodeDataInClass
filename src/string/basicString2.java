package string;

public class basicString2 {

	public static void main(String[] args) {
//	method in the string
		
		String str1 = "I Am A Automation Engineer.";
		String str2 = "Amit Tambe";
		String str3 = "AMIT Tambe";
		String str4 = "AMIT Tambe";
		String str5 = "AMIT TAMBE";
		String str6 = "";
		String str7 = "          ";
		
		//length
		int lengthOfString = str1.length();
		System.out.println("length of str1 = "+lengthOfString);
		System.out.println("length of str2 = "+str2.length());
		System.out.println("-------------------------------");
		//toUpperCase()
		System.out.println("Originl str1 = "+str1);
		System.out.println("Originl str2 = "+str2);
		System.out.println("---------------------------------");
		String a = str1.toUpperCase();
		System.out.println("toupperCase str1 = "+a);
		System.out.println("toupperCase str2 = "+str2.toUpperCase());
		//toLowerCase()
		System.out.println("---------------------------------");
		String aa = str1.toLowerCase();
		System.out.println("toLowerCase str1 = "+aa);
		System.out.println("toLowerCase str2 = "+str2.toLowerCase());
		System.out.println("---------------------------------");
		//equal()
		if(str3.equals(str4))
			System.out.println("str3 is equal to str4");
		else
			System.out.println("str3 is not equal to str4");
		if(str3.equals(str5))
			System.out.println("str3 is equal to str5");
		else
			System.out.println("str3 is not equal to str5");
		System.out.println("---------------------------------");
		//equalegnorecase()
		if(str3.equalsIgnoreCase(str4))
			System.out.println("str3 is equal to str4");
		else
			System.out.println("str3 is not equal to str4");
		if(str3.equalsIgnoreCase(str5))
			System.out.println("str3 is equal to str5");
		else
			System.out.println("str3 is not equal to str5");
		System.out.println("---------------------------------");
		// contains
		boolean result = str1.contains("Auto");
		 System.out.println("is the passed string is available in STR = " + result);
		 System.out.println(str1.contains("auto"));
		 System.out.println(str1.contains("."));
		 System.out.println(str1.contains("ma"));
		 System.out.println("---------------------------------");
		 // isEmpty()
		 System.out.println("str5 check is empty or not = "+str5.isEmpty());
		 System.out.println("str6 check is empty or not = "+str6.isEmpty());
		 System.out.println("str7 check is empty or not = "+str7.isEmpty());
		 System.out.println("---------------------------------");
		 // charAt
		 System.out.print(str3.charAt(0)+", ");
		 System.out.print(str3.charAt(1)+", ");
		 System.out.print(str3.charAt(2)+", ");
		 System.out.print(str3.charAt(3)+", ");
		 System.out.print(str3.charAt(4)+", ");
		 System.out.print(str3.charAt(5)+", ");
		 System.out.print(str3.charAt(6)+", ");
		 System.out.print(str3.charAt(7)+", ");
		 System.out.print(str3.charAt(8)+", ");
		 System.out.println(str3.charAt(9)+", ");
		 System.out.println("---------------------------------");
	}

}
