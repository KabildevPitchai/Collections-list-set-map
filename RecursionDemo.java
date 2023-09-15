package Collections;

public class RecursionDemo {

	public static void main(String[] args) {
		RecursionDemo ad=new RecursionDemo ();
		System.out.println(ad.hashCode());
		ad.add(5);
	}

	
	
	private void add(int no) {
		System.out.println(no);//5 4 3 2
		no--;//4 3 2 1
		if(no>0){//4>0 3>0 2>0 1>0
			add(no);//add(4) add(3) add(2) add(1) method calling statement
		//this.add(no);
		}
		else
		this.sub();
	}
	public void sub() {
		System.out.println("Sub method");
	}

}


//Recursion
//must use one if condition
//it is a method is used to without using a loop to get the output as same as Loop output
