package Typecasting;

public class Student {

	public static void main(String[] args) {
		Student s=new Student();//new keyword shows the new object
		s.study();//study():void-Student
	 	System.out.println(s.hashCode());//hashCode():int-Object
		String name="abc";
	 	Student s2=s;//s object saved in another object but saved inn same position 
		System.out.println(s2.hashCode());
		System.out.println(s.equals(s2));//equals() method
		}
	public boolean euqals(Object obj) {
		return true;
	}
	public  void study() {
		System.out.println("studying");
	}

}
