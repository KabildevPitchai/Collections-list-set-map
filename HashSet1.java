package Set_Interface;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class HashSet1 {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet(); 
		  hs.add(true);
		  hs.add(10);
		  hs.add(5.4f);
		  hs.add("abcd");
		  hs.add('c');
		  
		  System.out.println(hs);
		  
		  
		  ArrayList al = new ArrayList(); //ArrayList into LinkedHashSet
		  al.add('k');
		  al.add('a');
		  al.add('r');
		  al.add('t');
		  al.add('h');
		  al.add('i');
		  al.add('k');
		  al.add('a');
		  al.add('r');
		  
		  System.out.println(al);//[k,a,r,t,h,i,k,a,r]
		  
		  LinkedHashSet lhs = new LinkedHashSet(al);
		  System.out.println(lhs);//LinkedHashset no duplicates allowed so [k,a,r,t,h,i]
	}

	
}
