package DefaultFunctionalPractice;

public interface A {

	default void sayHello() {
		System.out.println("Hello A");
	}
}
