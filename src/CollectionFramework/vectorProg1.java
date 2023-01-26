package CollectionFramework;

import java.util.Vector;

public class vectorProg1 {

	public static void main(String[] args) {
 
		Vector v1 = new Vector();      //cc= 10 = 20 = 40
		Vector v2 = new Vector(500);   //cc= 500 = 1000 = 2000
		Vector v3 = new Vector(20,11);      //cc = 20 + 11 = 31 + 11 = 42
		Vector v4 = new Vector(v1);	
		
//		System.out.println("Capacity v1 = " + v1.capacity());
//		System.out.println("Capacity v2 = " + v2.capacity());
//		System.out.println("Capacity v3 = " + v3.capacity());
//		for(int i=0;i<20;i++)
//			v3.add(i);
//		
//		System.out.println("Capacity of v3 = " + v3);
//		System.out.println("Capacity of v3 = " + v3.capacity());
//		v3.add("ABC");
//		System.out.println("Capacity of v3 = " + v3);
//		System.out.println("Capacity of v3 = " + v3.capacity());
		
		v1.add("Amit");
		v1.add(100);
		v1.add(1.25);
		v1.add('c');
		v1.addElement(1000);
		v1.addElement(205);
		System.out.println(v1);
		v1.remove(5);
		System.out.println(v1);
		v1.addElement(3652);
		System.out.println(v1);
		v1.remove(5);
		System.out.println(v1);
		v1.set(1, 1000);
		System.out.println(v1);
		v1.setElementAt(1000, 4);
		System.out.println(v1);
		
		v1.add("Amit");
		v1.add(100);
		v1.add(1.25);
		v1.add('c');
		v1.addElement(1000);
		System.out.println(v1);
		
		System.out.println("-----------------------");
		for(Object value : v1)
			System.out.println(value);
		
	
	}

}
 