package nonstatic_concept;

public class parent {
	
	//static String address;
	String name="ravi";
	String location;
	int number;
	
	public parent(String name,String location) {
		this.name=name;
		this.location=location;
	}
	
	public parent(String name,int number) {
		this("sanvi", "pune");
		this.name=name;
		this.number=number;
	}
	
	public parent() {
		this("ravisss",01);
	}
	
	public static void information() {
		System.out.println("parent information");
	}
	
	public static void main(String[] args) {
		
		parent p = new parent("akasha",03);
		System.out.println(p.name);
		System.out.println(p.number);
		System.out.println(p.location);
	}

}
