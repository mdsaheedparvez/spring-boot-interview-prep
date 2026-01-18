package understandinfFunc;

public class Main {
	public static void main(String[] args) {
//		Employee employee = () -> "Vipul";
//		System.out.println(employee.getName());
//		ChaloThread chaloThread = new ChaloThread();
//		Thread thread = new Thread(chaloThread);
//		thread.run();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hello  " + i);
//		}
		Runnable runnable = ()-> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello  " + i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.run();
	}
}
