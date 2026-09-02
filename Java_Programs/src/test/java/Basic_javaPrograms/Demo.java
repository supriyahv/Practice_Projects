package Basic_javaPrograms;

public class Demo {
	
	//declaration statment should be there inside a class block--variable,method,another class
	//Initializer statment ---static initializer,non-static initializer & constructor
	//declare means creating 
	
	int a;	//variable declaration--non static varaible ---default is 0
	int b=10;//variable declaration & initialization
	static int d=50;
	 static int g=10;//default is 0
	
	public void hello() {	//method declaration
		
	}
	
	public static void main(String[] args) {//jre will check for main method then only execution is done
	//we can compile empty class,but we can't execute empty class.
		
		//System.out.println(b);//we can't pass non static variable inside static block directly
		int c=50;//local varaible should be initialized
//local varaible will not be static or nonstatic ,they are used inside method block only
		System.out.println(c);
		
		int s =200;//local variable
		s=300;//reinitialized
		System.out.println(s);
		
		d=30;//reinitialize the static variable
		System.out.println(d);
		
		Demo demo = new Demo();
		demo.a=700;//reinitialize the non static variable
		System.out.println(demo.a);
		
		int g=10;
		System.out.println(g);
		
		
		
	}
	
	

}
