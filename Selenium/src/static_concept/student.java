package static_concept;

public class student {
	//Class block--static variable should be created in class block
	static int Id;//default value is 0
	static String name;//default is null
	static String result= "pass";//static initializer
	static int score=10;//static initializer--single line
	
	public static void marks() {//static method can be called in same class directly & 
		//another class with student.marks()
		System.out.println("student marks are---"+score);
	}
	
	public void studentlist() {//non static method
		System.out.println("student list----"+name);//static variable is used in non static method
		System.out.println("student---"+result);
	}
	
	static {    //multiline initializer
		String location="Pune";
		String college="Qspider";
		
	}
	
	public static void main(String[] args) {//method block
		
		marks();//direct method name--static method 
		//System.out.println("student---"+location);
		student s = new student();
		s.studentlist();
		
		
	}

}
