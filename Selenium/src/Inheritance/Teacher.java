package Inheritance;

public class Teacher {//Parent class
	
	int marks;//non static variable
	static String name;//static varaibale
	static int num=1;//static initializer
	int section=2;//nonstatic initilaizer
	
	public void grade() {//non static method
		System.out.println("grade T");
	}
	
	public static void data() {//static method
		System.out.println("data T");
	}

}
