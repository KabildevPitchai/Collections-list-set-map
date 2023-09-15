 package Typecasting;

public class Engineer extends Student {

	public static void main(String[] args) {
		Engineer e=new Engineer(); 
		//e.do_project();   //reference purpose
		//e.study();
		
		//Student s=(Student)e;//Up casting or Widen casting
		//s.study();
		//s.do_project();//not possible because its changed engineer into student so can't change
		
		Student s= new Engineer(); //we created new object for engineer class
	 	Engineer en=(Engineer)s;  //e is already object in 6th line
		en.do_project();
		en.study();
	
	}
	public void study() {
		System.out.println("Engineer-study");
	}
	private void do_project() {
		System.out.println("Do-projects");
	}
}
