package exercises3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
		city.add("Bangalore");//
		city.add("Delhi"); 
		city.add("Delhi");
		city.add("Akash");   
		System.out.println("  "+city);  
				
		//creating vector
		System.out.println("\nVector");
		Vector<Integer> vec = new Vector();
		vec.addElement(15); 
		vec.addElement(30); 
		vec.addElement(30); 
		vec.addElement(10); 
		System.out.println("  "+vec);
				
		//creating linkedlist
		System.out.println("\nLinkedList");
		LinkedList<String> names=new LinkedList<String>();  
		names.add("Alex");  
		names.add("John");  
		names.add("John");
		names.add("AAnoha");
		System.out.println(names);
		Iterator<String> itr=names.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());
	    }  
			       
//	    creating hashset, equals elements are discarded, in order always
		System.out.println("\nHashSet");
		HashSet<Integer> set=new HashSet<Integer>();  
		set.add(101);  
		set.add(103);  
		set.add(102);
		set.add(104);
		set.add(103);
		System.out.println(set);
			       
		//creating linkedhashset, equals elements are discarded, in the same order we introduce it
		System.out.println("\nLinkedHashSet");
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		set2.add(11);  
		set2.add(13);  
		set2.add(12);
		set2.add(14);	
		set2.add(12);
		set2.add(1);
		System.out.println(set2);

	}

}
