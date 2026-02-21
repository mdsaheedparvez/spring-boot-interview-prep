package DefaultFunctionalPractice;

public class Mybabyy implements Mybaby {

	public static void main(String[] args) {
		Mybabyy mybabyy = new Mybabyy();
		mybabyy.sayHello();
		mybabyy.sayHello1();
		Mybaby.sayhello();
	}

	@Override
	public void sayHello1() {
		System.out.println("from functinal interface defalut abstract method call");
	}

}
