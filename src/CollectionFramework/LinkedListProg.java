package CollectionFramework;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProg {

	public static void main(String[] args) {
		
		LinkedList x = new LinkedList();
		LinkedList y = new LinkedList(x);
		
		System.out.println(x.size());
		x.add("jon");
		x.add("saersi");
		x.add("LittleFinger");
		x.add(100);
		x.add('x');
		x.add(12.25);
		x.add('x');
		x.add(null);
		x.add('x');
		x.addFirst("sansa");
		x.add('x');
		x.addLast("arya");
		
		System.out.println(x);
		x.contains(100);
		x.poll();
		System.out.println(x);
		x.pollFirst();
		System.out.println(x);
		x.pollLast();
		System.out.println(x);
		x.remove();
		System.out.println(x);
		x.removeFirst();
		System.out.println(x);
		x.removeFirstOccurrence('x');
		System.out.println(x);
		x.removeLastOccurrence('x');
		System.out.println(x);
		
		
		
		
	}

}
