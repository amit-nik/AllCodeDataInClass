package logicalProram;

public class sortThreeNum1 {

	public static void main(String[] args) {

		int a = 50, b = 351, c = 458, d = 58;
		
		if(a>b)
		{
			int temp;
			temp = a;
			a = b;
			b = temp;		
		}
		if(b>c)
		{
			int temp;
			temp = b;
			b = c;
			c = temp;	
		}
		if(c>d)
		{
			int temp;
			temp = c;
			c = d;	
			d = temp;		
		}
		if(d>a)
		{
			int temp;
			temp = d;
			d = a;	
			a = temp;		
		}
	
		System.out.println(a + " " + b + " " + c + " " + d);
		
	}

}
