package Array_Programs;

public class duplicate_String_array {
	
	public static void main(String[] args) {
		
		 String[] s = {"hi","bye","hello","hi","hello"};
	        
	        for(int i =0;i<s.length;i++){
	            for(int j=i+1;j<s.length;j++){
	                if(s[i].equals(s[j])){
	                    System.out.println(s[i]);
	                }
	            }
	        }
	        
	}

}
