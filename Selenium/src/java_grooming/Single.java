package java_grooming;

public class Single {
	
	//Single turn class
	//we can't create multiple object ,only one object is created.
	
	 String name;
	int id;
	public static Single ref=null;
	
	private Single(String name,int id) {
		this.id=id;
		this.name=name;
	}
	
	public static Single getSingleClassObj(String name,int id) {
		if(ref==null) {
			
		
		 ref = new Single("pune",10);
		}
		return ref;
	}
	

}
