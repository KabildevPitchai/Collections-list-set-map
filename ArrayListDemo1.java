package Collections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); 
	    al.add("KapilDev");
	    al.add(150);
	    al.add(23);
	    al.add(45.4f);
	    al.add(50);
	    al.add(true);
	    al.add(true);
	    al.add(false);
	    System.out.println(al);//[kapildev,150,23,45.4f,50,true,true,false]
	    
	    ArrayList kapil=new ArrayList();
	    kapil.add(150);
	    kapil.add(23);
	    kapil.add(45);
	    kapil.add(50);
	    
//	    int[] ar = {10,20,30}; 
//	    for(int aa:ar)
//	    {
//	      
//	    }
	    
	    
	    for(Object elem: al)
	    {
	    	System.out.println(elem);
	      try 
	      {
	    	  //Typecasting:
	    	  //Parent Object to Child Object  or Downcasting 
	      Integer i = (Integer) elem; //
//	      System.out.println(i);
	      System.out.println(i);
	      }
	      catch(ClassCastException cce)
	      {
	        
	      }
	      
	    }
	    
	    int total=0;
	    for(Object score:kapil) {
	    	Integer sc=(Integer) score;
	    	if(sc>=50) {
	    		total=total+sc;
	    		System.out.println(score);
	    	}
	    }
	    
	     
		
	}

	
}
