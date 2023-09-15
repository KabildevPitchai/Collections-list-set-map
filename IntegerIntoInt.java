package Collections;

import java.util.ArrayList;

public class IntegerIntoInt {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		find_total(al);//its a Static method so without using object name or directly called it 
		
		
		ArrayList ar=new ArrayList();
		ar.add("kabil");
		ar.add("karthika");
		ar.add("kausi");
		ar.add("kavitha");	
		ar.add("tamilselvi");
		System.out.println(ar);
		
		find_all(ar);
		
	}
	
	
	private static void find_all(ArrayList ar) {
		String all=" ";
		for(Object o:ar) {
			String count=(String)o;//String into String typecasting (Object class act like a collection class datatype)
			all=all+count;
		}
		System.out.println(all);
	}

	private static void find_total(ArrayList al) {
		 int total = 0; 
		    for(Object ob: al)
		    {
		    int value = (Integer)ob;
		    total = total + value; 
		    }
		    System.out.println(total);
	}

}

//ArrayList-->int values(datatypes)into-->(Class)Integer values:(super class)Object objects