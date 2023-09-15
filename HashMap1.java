package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap(); 
	    hm.put("virat", 45);
	    hm.put("dhoni", 55);
	    hm.put("rohit", 85);
	    hm.put("dhawan", 50);
	    hm.put("kapil", 100);
	    hm.put("rohit", 87);
	    hm.put("rohit", 91);
	    hm.put("raina", 91);
//	    System.out.println(hm.keySet());//return SET
//	    System.out.println(hm.values());//return Collection
//	    
//	    System.out.println(hm);
//	    System.out.println(hm.entrySet());//return SET
	   
//	    int score=0;
	    String name = ""; 
	    int big = 0;
	    Entry en=null;
	    Set s  = hm.entrySet();  //cant use for loop becoz SET is not an index based one
	    for(Object ob: s)
	    {
	    	Entry entry=(Entry) ob;//Typecasting
	    	int score=(Integer)entry.getValue();//it gives score value who scored big
//	    	System.out.println(entry.getKey()+ ":"+entry.getValue());
	     // System.out.println(ob);
//	    	 int score= score+(Integer)entry.getValue(); //take total score
	    	 // if(score==100)
	    	  if(score>big)
	  	    {
	    		  en=entry;//its equal to big & name to simply for using entry
//	  	      big = score; 
//	  	      name = (String)entry.getKey(); 
	  	    }
	  	  
	  	  }
	    System.out.println(en);
//	  	  System.out.println(name + " scored highest " + big);//same as en line
	}

}
