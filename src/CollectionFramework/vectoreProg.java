package CollectionFramework;

import java.util.Vector;

public class vectoreProg {

	public static void main(String[] args) {

		Vector v = new Vector();
		Vector v1 = new Vector(100);	
		
		System.out.println("capacity of vector v = " + v.capacity());
		System.out.println("capacity of vector v1 = " + v1.capacity());
		
		for(int i=0;i<10;i++)
			v.add(i);
		
		System.out.println(v);
		System.out.println("capacity of vector v = " + v.capacity());
		v.add(100);
		System.out.println(v);
		System.out.println("capacity of vector v = " + v.capacity());
		
		System.out.println("-------------------------------");
		
		for(int i=0;i<100;i++)
			v1.add(i);
		
		System.out.println(v1);
		System.out.println("capacity of vector v1 = " + v1.capacity());
		v1.add(1000);
		System.out.println("capacity of vector v1 = " + v1.capacity());
		

	}
	

}
