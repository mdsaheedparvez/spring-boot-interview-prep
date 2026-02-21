package DefaultFunctionalPractice;

@FunctionalInterface
public interface Mybaby {
  public void sayHello1();
  
  default void sayHello() {
	  System.out.println("call me abhishek from default method");
  }
  public static void sayhello() {
	  System.out.println("STATic methodddd");
  }
}

