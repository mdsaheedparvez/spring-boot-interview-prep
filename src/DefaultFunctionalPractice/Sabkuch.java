package DefaultFunctionalPractice;

public class Sabkuch implements A, B {
	public static void main(String[] args) {
		Sabkuch sbSabkuch = new Sabkuch();
		sbSabkuch.sayHello();
	}

	@Override
	public void sayHello() {
//		B.super.sayHello();
		System.out.println("hello sabkucj");
	}
}
