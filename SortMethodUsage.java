package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethodUsage {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
	    al.add(20);
	    al.add(10);
	    al.add(5);
	    al.add(25);	    
	    Collections.sort(al);
	    
	    System.out.println(al);

	    
	    al = new ArrayList(); 
	    al.add("pqrs");
	    al.add("wxyz");
	    al.add("abcd");
	    al.add("efgh");
	    
	    Collections.sort(al);
	    
	    
	    System.out.println(al);
	    
	    
	    
	    

	}

}
