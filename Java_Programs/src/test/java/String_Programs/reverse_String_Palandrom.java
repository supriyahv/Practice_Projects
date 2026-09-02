package String_Programs;

public class reverse_String_Palandrom {
	
	public static void main(String[] args) {
		
		 String s="amma";
	        String rev="";
	        for(int i=s.length()-1;i>=0;i--){
	            char ch=s.charAt(i);
	            rev=rev+ch;
	        }
	        
	        
	        
	        
	        
	        System.out.println("Try programiz."+rev);
	        if(rev.equals(s)){
	            System.out.println("its palandrom ");
	        }else{
	           System.out.println("its not palandrom "); 
	        }
	}

}
