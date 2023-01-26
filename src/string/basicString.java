package string;

public class basicString {

	public void comparenumber()
	{
		int a = 10 , b= 10;
		if(a==b)     //( "==" sign is mentionn the cotent in integer)
			System.out.println("equal number");
		else
			System.out.println("not equal nnumber");
	}
	public void compareString()
	{
		String a = "amit", b="amit";
		String zz = new String("amit");
		if(a==b) 			//( "==" sign is mentionn the memeoery address in string)
			System.out.println("equal string");
		else
			System.out.println("not equal string");
		if(a==zz)
			System.out.println("equal string");
		else
			System.out.println("not equal string");
		if(a.equals(b)) 			//( " .equal() " sign is mentionn the content in string)
			System.out.println("equal string");
		else
			System.out.println("not equal string");
		if(a.equals(zz))
			System.out.println("equal string");
		else
			System.out.println("not equal string");
	}
	public static void main(String[] args) {
		basicString z = new basicString();
		z.comparenumber();
		z.compareString();

	}

}
