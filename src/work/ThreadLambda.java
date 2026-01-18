package work;

public class ThreadLambda {

	public static void main(String[] args) {

		Runnable d = ()-> {
			for(int i = 1;i<=10;i++) {
				System.out.println("value of i "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
//		d.run();
		Thread th = new Thread(d);
		th.start();
	}

}
