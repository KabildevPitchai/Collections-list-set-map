package Collections;

import java.util.ArrayList;

public class AllowStringObjects {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Integer no = 5; 
		  String name = no.getClass().getSimpleName();//OBJECT CLASS METHODS
		  if(name.equals("String"))
		    al.add(no);
		  
		  String s = "abcd";
		  name = s.getClass().getSimpleName();
		  if(name.equals("String"))
		    al.add(s);
		  
		  System.out.println(al);
	}

}


//getname give o/p is:given i/p DATATYPE ex:5 then its shows INTEGER
