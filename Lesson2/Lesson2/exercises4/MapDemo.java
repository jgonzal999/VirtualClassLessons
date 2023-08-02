package exercises4;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		
		//HashMap, key in order
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	    hm.put(4,"Frank");
		hm.put(1,"Tim");    
	    hm.put(2,"Mary");    
	    hm.put(3,"Catie");  
	    hm.put(1,"Timmmmmmm"); 
	    hm.put(5,"Catie"); 
	       
	    System.out.println("\nThe elements of Hashmap are ");  
	    for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	    }
	      
	    //HashTable, key not in order
	       
	    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	    ht.put(8, "Javier");  
	    ht.put(4,"Ales");  
	    ht.put(5,"Rosy");  
	    ht.put(6,"Jack");  
	    ht.put(7,"John");
	    ht.put(4,"Alesssss"); 
	    ht.put(9,"John"); 

	    System.out.println("\nThe elements of HashTable are ");  
	    for(Map.Entry n:ht.entrySet()){    
	    	System.out.println(n.getKey()+" "+n.getValue());    
	    }
	      
	      
	    //TreeMap, key in order
	      
	    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(11,"Peter");
	    map.put(8,"Annie");    
	    map.put(9,"Carlotte");    
	    map.put(10,"Catie");   
	    map.put(8,"Annieeeeeee");
	    map.put(12,"Catie");
	      
	    System.out.println("\nThe elements of TreeMap are ");  
	    for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	    }    


	}

}
