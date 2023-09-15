package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Kabil");
		al.add("sneka");
		al.add("sandhiya");
		al.add("ramkumar");
		al.add("subramani");
		al.add(true);
		
		System.out.println(al);
		al.add("kausi");
		System.out.println(al);
		al.add(1,"karthika");//adding the value input to the position of index to insert the value
		System.out.println(al);
		al.remove(4);//it removes the index of input
		System.out.println(al);
		al.addAll(al);
		System.out.println(al);
	}

}
