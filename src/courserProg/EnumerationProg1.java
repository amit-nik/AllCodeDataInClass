package courserProg;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProg1 {

	public static void main(String[] args) {

		 Vector v = new Vector();
		  v.add(10);
		  v.add(25);
		  v.add(50);
		  v.add(20);
		  v.add(25);
		  v.add(23);
		  v.add(25);
		  System.out.println(v);
		  Enumeration e = v.elements();
		  while(e.hasMoreElements()) {
		   System.out.print(e.nextElement()+" ");
		 }
	}
}
