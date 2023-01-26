package courserProg;
import java.util.ListIterator;
import java.util.Vector;
public class listIteratorProg {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		for(int i=0; i<18; i++)
		v1.add(i);
		System.out.println(v1);
		ListIterator obj = v1.listIterator();
		while(obj.hasNext())
		{
		int value1 = (int) obj.next();
		if(value1==3)
			obj.remove();
		else if(value1==2)
			obj.add(2222);
		else if(value1==5)
			obj.set(5555);
//		System.out.print(obj.next()+" ");	
		}
		System.out.println("*********");
		System.out.println(v1);
		System.out.println("--------------------");
		ListIterator xyz = v1.listIterator();
		while(xyz.hasNext())
		System.out.print(xyz.next()+" ");
		System.out.print(xyz.previous()+ " ");
		System.out.println(xyz.previous());
		System.out.println("--------------------");
		while(xyz.hasPrevious())
		System.out.print(xyz.previous()+" ");
		System.out.print(xyz.next()+" ");
		System.out.println(xyz.next());
	}
}
