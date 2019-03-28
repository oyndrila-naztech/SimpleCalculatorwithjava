package stdproject;

public class Polymorphism {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int pcal = cal.add(10, 10);
		System.out.println(cal.add(10.50, 10,10));

	}

}
