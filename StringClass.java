package Collections;

import java.util.ArrayList;

public class StringClass {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
	    al.add("I"); 
	    al.add("love");
	    al.add("Java"); 
	    for(int i=0; i<al.size(); i++)
	    {
	    Object ob = al.get(i); //I love Java
	    if(ob.equals("Java"))
	        {
	        al.set(i, "Python"); 
	        }
	    }
	    System.out.println(al);
	}

}

//To Change the String value into the Given String by This method