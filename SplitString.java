package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SplitString {

	public static void main(String[] args) {
//		ArrayList al = new ArrayList(); 
//	    al.add("I"); 
//	    al.add("love");
//	    al.add("Java"); 
//	    for(int i=0; i<al.size(); i++)
//	    {
//	    //Object ob = al.get(i); //I love Java
//	    if(al.get(i).equals("Java"))
//	        {
//	        al.set(i, "Python"); 
//	        }
//	    }
//	    System.out.println(al);
	
	
	ArrayList al = new ArrayList(); 
    al.add("I"); 
    al.add("love");
    al.add("Java"); 
    al.add("I"); 
    al.add("love");
    al.add("India"); //I love Java I love India
    
    HashSet hs = new HashSet();
    
    for(Object ob: al)
    {
      boolean added = hs.add(ob);
      if(added == false)
      {
        System.out.println(ob);
      }
    }

	}
}
