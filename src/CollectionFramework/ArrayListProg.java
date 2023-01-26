package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProg {

	public static void main(String[] args) throws Exception {


		ArrayList x = new ArrayList();     //Default Capacity 10
		ArrayList y = new ArrayList(1000);
		ArrayList z = new ArrayList(y);
			
		z.add(500);
		z.add('a');
		x.add('A');
		x.add("amit");
		x.add("tambe");
		x.add(53.58);
		x.add(null);
		x.add(10000);
//		add Method Add The Element and Object. 
		y.add(500);
		x.add(y);
		y.add('a');
//		This add method add element and Object in index/any or 1st, 2nd position.
		x.add(1, 10);
		x.add(2, y);
		System.out.println(x);
//		Add The element in the collection. 
		x.addAll(y);
		System.out.println(x);
//		Add The element in the collection in third idex.
		x.addAll(3, y);
		System.out.println(x);
//		clear method clear the all element in the 'x' collection
//		x.clear();
//		System.out.println(x);
//		This contains is used to verify element presented.
		System.out.println(x.contains(10));
//		This contains is used to verify collection/obj presented.
		System.out.println(x.containsAll(y));
//		This equal method use the compaire the obj to obj.
		System.out.println(z.equals(y));
//		This get Method use the get 5th index value
		System.out.println("get 5th index value ="+ x.get(5));
//		this method use to find the first index of any element or collection/obj.
		System.out.println("first Index of Object =" + x.indexOf(y));
		System.out.println("first Index of ele =" + x.indexOf(53.58));
//		This method verify the object is empty or not.
		System.out.println("verify obj is empty or not = "+ x.isEmpty());
//		this method use to find the last index of any element or collection/obj.
		System.out.println("last Index of Object =" + x.lastIndexOf(y));
		System.out.println("last Index of ele =" + x.lastIndexOf(500));
//		This remove method use to remove any index of element in the collection.
		x.remove(6);
		System.out.println("remove 6th element = "+ x);
//		This remove method use to remove first object in the collection.
		x.remove(y);
		System.out.println("remove first obj = "+x);
//		This remove method use to remove All object of element in the collection.
		x.removeAll(y);		
		System.out.println("remove all obj of element = "+x);
//		pls find how to work this method.
//		x.removeIf(null);
//		System.out.println(x);
//		remove from the list of the all element that not contain int the specific collection
		y.retainAll(x);
		System.out.println(x);
//		this method use the set/replace the element /obj index we declare in the method
		x.set(6, "Nik");
		System.out.println(x);
//		pls find how to work this method.
//		x.replaceAll(null);;
//		System.out.println(x);
//		this size method find the size of colector or obj
		System.out.println("Size of the array list = "+ x.size());
//		sort method sort the sequqntialy ascending order
//		sort method data in the array list is homogenious.
		ArrayList aa = new ArrayList<>();
		aa.add(6);
		aa.add(7);
		aa.add(5);
		aa.add(4);
		Collections.sort(aa);
		System.out.println("sort ascending =" +aa);
//		reverse method print the descending order.
		Collections.reverse(aa);
		System.out.println("sort descending =" +aa);
//		toArray method ArrayList convert Array.
		x.toArray();
		System.out.println("convert to array = "+x);
		x.trimToSize();
		System.out.println("trim to size = "+x);
		x.subList(0, 1);
		System.out.println(x);
		
	}

}
