package Abstract_Interface;

public abstract class Student {
	
	//abstract method --incomplete 
	public abstract void  marks();
	
	

public  void  score() {//we can pass non static method in abstract class
System.out.println("total score");
}
}

class Teacher extends Student{
	
	//implementation
	public void marks() {
		System.out.println("total mark ");
	}
}

class Classroom{
	
	public static void main(String[] args) {
	
	Teacher t = new Teacher();
	t.marks();
	t.score();
}
}

