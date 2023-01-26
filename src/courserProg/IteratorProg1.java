package courserProg;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class IteratorProg1 {

	public static void main(String[] args) {

		Vector  ll = new Vector();
        ll.add (10);
        ll.add (25);
        ll.add (50);
        ll.add (20);
        ll.add (25);
        ll.add (23);
        ll.add (60);
        ll.add (25);
        ll.add (30);
        ll.add (40);
        ll.add (15);
        ll.add (25);
        System.out.println (ll);
        Iterator it = ll.iterator();
        while(it.hasNext());
        {
        	int e = (int) it.next ();
        	System.out.println(e);
        }
        Iterator it1 = ll.iterator();
        while(it1.hasNext());
        {
        	int e = (int) it1.next ();
        	if(e==25)
        	{
        		it1.remove();
        	}
        }
        System.out.println(it1);
	}

}
