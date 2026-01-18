package DefaultFunctionalPractice;

public interface B {
	default void sayHello() {
		System.out.println("Hello B");
	}
}
