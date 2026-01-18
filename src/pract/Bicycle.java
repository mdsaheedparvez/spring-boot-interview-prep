package pract;

public class Bicycle {
    private static Bicycle bicycle;
	private Bicycle(){
		
	}
	
	public static Bicycle getBicycle() {
		if(bicycle == null)
		   bicycle = new Bicycle();
		
		return bicycle;
	}
	
}
