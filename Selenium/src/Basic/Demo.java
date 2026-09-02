package Basic;

public class Demo implements Child {
	
	public void location() {
		System.out.println("Pune");
	}
	
	public void locations() {
		System.out.println("Pune,Hadapsar");
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.location();
		d.locations();
	}

}
