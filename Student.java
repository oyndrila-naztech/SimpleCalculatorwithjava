package stdproject;

public class Student {

	public static void main(String[] args) {
		System.out.println("hello world");
		add();
		sub();
		multiplication();
		div();

	}
	public static void add() {
	    double x=10.00;
	    double y = 14.05;
	    double z=x+y;
	System.out.println(z);
	}
	
	public static void sub() {
	    double x=20.00;
	    double y = 14.05;
	    double z=x-y;
	System.out.println(z);
	}
	
	public static void multiplication() {
	    double x=20.00;
	    double y = 14.05;
	    double z=x*y;
	System.out.println(z);
	}
	
	public static void div() {
	    double x=20.00;
	    double y = 14.05;
	    double z=x/y;
	System.out.println(z);
	}
	
}
