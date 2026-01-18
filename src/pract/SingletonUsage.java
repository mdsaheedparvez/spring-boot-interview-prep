package pract;

public class SingletonUsage {

	public static void main(String[] args) {

		Bicycle bicycle1 = Bicycle.getBicycle();
		Bicycle bicycle2 = Bicycle.getBicycle();
		
		System.out.println(bicycle1.hashCode());
		System.out.println(bicycle2.hashCode());
	}

}
