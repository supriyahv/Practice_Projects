package static_concept;

public class parent {
	
	static int a;	//variable
	static String location;	//initializer
	
	public static void main(String[]args) {
		System.out.println(a);
		System.out.println(location);
	}
	
	static {	//block or multiline initializer
		System.out.println("Pune");			//first static block will be executed then main block.
	}

}
