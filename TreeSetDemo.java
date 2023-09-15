package Set_Interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	
		TreeSet hs = new TreeSet(); 
		  hs.add("sneka");
		  hs.add("kabil");
		  hs.add("suburamani");
		  
		  //lexicon: dictionary: 
		  
		  
		  System.out.println(hs);
	

	
	ArrayList marksList = new ArrayList(); 
    Scanner sc = new Scanner(System.in);
    

    while(true)
    {
      System.out.println("Enter Mark: ");
      String mark = sc.next(); 
      try {
      Integer i = Integer.parseInt(mark);
      marksList.add(mark);
      }
      catch(ClassCastException | NumberFormatException cce)
      {
        break; 
      }
      
    }
    System.out.println(marksList);

}

}
