package string;

public class sample {

	
	public static void main(String[] args) {
		
		String str = "amit";
		String str1 = "amiT";
		System.out.println(str);
		str.concat(" TAMBE");
		System.out.println(str);
		
		System.out.println(str.compareToIgnoreCase(str1));
	
		StringBuffer a = new StringBuffer("AMIT");
		a.append(" TAMBE");
		System.out.println(a);
	}

}
