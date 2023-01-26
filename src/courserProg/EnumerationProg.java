package courserProg;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProg {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		for(int i=0; i<20; i++)
			v1.add(i);
		System.out.println(v1);
		
		Vector v2 = new Vector();
		for(int i =0; i<200; i++)
		v2.add(i);
		v2.add("amit");
		System.out.println(v2);
		for(int i = 2; i<10; i++)
		System.out.print(v1.get(i)+" ");
		System.out.println(v2.capacity());
		
		for(Object value: v1)
			System.out.println(value);	
		int i = 0;
		Enumeration obj = v1.elements();
		while(obj.hasMoreElements())			
		{
		System.out.print(obj.nextElement()+" ");
		i++;
		if(i==10)
			break;
		}
		System.out.println();
		if(obj.equals(v2))
		System.out.println("test case pass");
		else
		System.out.println("test case fail");
	}

}
