package string_Concept;

public class Demo {
	//String is non static 
	String name="akash";//string literal---here also object created in string constant pool
	String place = new String();//object created in heap area
	
	public static void main(String[] args) {
		System.out.println(place);
		String place = new String();
		String name="arpita";
		System.out.println(name);//arpita
		System.out.println(name.charAt(0));//a
		System.out.println(name.indexOf('r'));//1
		System.out.println(name.concat("Patil"));
		
	}

}
