package Collections;

import java.util.ArrayList;

public class GenericUsageInArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		find_total(al);
		}
	private static void find_total(ArrayList<Integer> al) {
		    // TODO Auto-generated method stub
		    int total = 0; 
		    for(Integer ob: al)
		    {
		    //int value = (Integer)ob; //Auto UnBoxing
		    total = total + ob; 
		    }
		    System.out.println(total);
		    
		  }

		
	}

//Generics provides us Type Safety. 
//Generics avoids Type Casting.


