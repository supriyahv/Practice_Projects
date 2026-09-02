package Abstract_Interface;

public class Tree implements plant {
	
	public void fruits() {//method override---new implimentation is given from child class
	System.out.println("all fruits--new implementation");	
	}
	
}

class family{
	
	public static void main(String[] args) {
		
		Tree t = new Tree();
		t.fruits();
	}
	
}

