package Collections;

import java.util.ArrayList;

public class Mobiles_child {

	public static void main(String[] args) {
		Mobiles m1 = new Mobiles("Sony", 15000);
	    Mobiles m2 = new Mobiles("Samsung", 18000);
	    Mobiles m3 = new Mobiles("Apple", 12000);
	    Mobiles m4 = new Mobiles("Vivo", 25000);
	    
	    ArrayList mobilesList=new ArrayList();
	    mobilesList.add(m1);
	    mobilesList.add(m2);
	    mobilesList.add(m3);
	    mobilesList.add(m4);
	    
	    System.out.println(mobilesList);//Hashcode of hexadecimal value show it
	    //[m1,m2,m3,m4]

	    for(Object ob:mobilesList) {
	    	
	    	//Typecasting: Downcasting-child change into parent
	    	Mobiles mobile=(Mobiles)ob;//if we want 15k above price mobiles we want to Typecasting because in this Loop We USING OBJECT CLASS SO ACCESS ONLY OBJECT CLASS METHODS SO WE WANT TO TYPECAST INTO MOBILE CLASS 
	    	if(mobile.price==15000)
	    	System.out.println(ob);
	    }
	}

}
