package pract;

public final class RuleToImmutable {

	private final int i;
	private final int j;
	
	public int getJ() {
		
		return  j;
	}
	
	public int getI() {
				
				return  i;
			}
	
	 RuleToImmutable(int i,int j){
		this.i =i;
		this.j=j;
	}
	
	public static void main(String[] args) {
		RuleToImmutable rv = new RuleToImmutable(10, 20);
		System.out.println(rv.getI());
		System.out.println(rv.getJ());
	}

}
