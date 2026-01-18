package DefaultFunctionalPractice;

interface C {
	public static void hello() {
		System.out.println("hello static");
	}
	default void defau() {
		System.out.println("default method");
	}
}

public class StaticSamjh implements C {
	public static void main(String[] args) {
       StaticSamjh staticSamjh = new StaticSamjh();
//       ((C) staticSamjh).hello();
       staticSamjh.defau();
       C.hello();
	}
}
