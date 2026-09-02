package Inheritance;

public class Student extends Teacher {
	
	static int num=8;//static initializer
	int section=9;//nonstatic initilaizer
	
	
	
	public static void main(String[] args) {
		data();//static var
		Student s = new Student();
		s.grade();//nonstatic var
		System.out.println(s.marks);
		System.out.println(name);//static
		System.out.println(num);//inhertance not achieved in static intializer
		System.out.println(s.section);//inhertance not achieved in non static intializer
		
	}

}
