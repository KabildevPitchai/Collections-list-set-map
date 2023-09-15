package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Mobiles implements Comparable {
	
	public static void main(String [] args) {
		
		
	
	
	Mobiles m1 = new Mobiles("Sony", 20);
    Mobiles m2 = new Mobiles("Apple", 25);
    Mobiles m3 = new Mobiles("Samsung", 28);
    Mobiles m4 = new Mobiles("Vivo", 12);
    
    ArrayList<Mobiles> mobilesList = new ArrayList<Mobiles>(); 
    
    mobilesList.add(m1);
    mobilesList.add(m2);
    mobilesList.add(m3);
    mobilesList.add(m4);
    Collections.sort(mobilesList);
	
    System.out.println(mobilesList);
	}

	
	
	
	 String brand; 
	  int price; 
	  public Mobiles(String brand, int price) {
	    this.brand = brand;
	    this.price = price;
	  }
	  
	  public String toString()
	  {
	    return this.brand + " "+ this.price; 
	  }
	  
	  @Override     //becoz IMPLEMENTS COMAPARABLE IS INTERFACE SO METHOD IS OVERRIDEN
	  public int compareTo(Object o) { 
		int price2 = this.price; 
	    String brand2 = this.brand; 
	    Mobiles m1 = (Mobiles) o;
	    int price1 = m1.price; 
	    String brand1 = m1.brand;
	    int result = brand1.compareTo(brand2); 
	    if(price1>price2)
	      return -1234; 
	    else if (price1<price2)
	      return 5; 
	    
	    return 0;	  
	    }

	  
	  
}
