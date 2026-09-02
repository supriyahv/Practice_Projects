package Inheritance;

class Parent {
	
	static int age;//static variable we can use in heritance
	static void family() {//static method can inherti
		
	}

}

class Child extends Parent{
	
	public static void main(String[] args) {
		
		System.out.println(age);
		family();//no need to call class name.method name
	}
}