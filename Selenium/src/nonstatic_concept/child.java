package nonstatic_concept;

public class child extends parent{
	
	String name="reka";
	
	public void details() {
System.out.println(super.name);//super keyword is used to access static & nonstatic members of parent class
System.out.println(name);//default it will access members of child class.
	}
	
	public child(String address,int priority) {
		//super("bye",8);
		super.location=address;
		super.number=priority;
	}
	
	public static void main(String[] args) {
		
		parent p = new parent("hello",9);
		System.out.println(p.name);
		System.out.println(p.number);
		
		child c = new child("Pune",5);
		System.out.println(c.location);
		System.out.println(c.number);
		c.details();
		
		//System.out.println(p.name);
	}

}
