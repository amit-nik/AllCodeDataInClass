package courserProg;

import java.util.Iterator;
import java.util.Vector;

public class IteratorProg {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		for(int i=0; i<20; i++)
		v1.add(i);
		System.out.println(v1);
		
		Iterator obj = v1.iterator();
		while(obj.hasNext())
		{
			int value =(int) obj.next();
			System.out.print(value+" ");
		}		
		System.out.println();
		System.out.println("********************");
		Iterator obj1 = v1.iterator();
		while(obj1.hasNext())
		{
			int value1 =(int) obj1.next();
			if(value1%2==0)
			System.out.print(value1+" ");
			else
				obj1.remove();
		}
			
	}

}
