package Abstract_Interface;

public interface Demo {
	
	void test();//by defalut public & abstract method
	
	//we cannot use non static method in interface
//	void tests() {//abstract method as no body 
//		
//	}
	
	public static final int a=10;//public static final variable is allowed
	int b=20;//by defalut public static final variable
	
//	Demo(){			constructor not allowed
//		
//	}
	
	public static void main(String[] args) {//static method can be used
		System.out.println("Hello");
		System.out.println(a);
		System.out.println(b);
	}

}
