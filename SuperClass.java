package inheritance;

 class Dog{
	public void add1() {
		System.out.println("add dog");
		
	}
}


public class SuperClass extends Dog {
	public void add1() {
		System.out.println("add super");
	}
public static void main(String[] args) {
	SuperClass s= new SuperClass();
	s.add1();
	super.add1();
}
}
