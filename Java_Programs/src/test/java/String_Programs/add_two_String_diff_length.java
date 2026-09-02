package String_Programs;

public class add_two_String_diff_length {
	
	public static void main(String[] args) {
		
		 String s1="hello";
	        String s2="123456787";
	        String sum="";
	        int max=Math.max(s1.length(),s2.length());
	        for(int i=0;i<max;i++){
	           if(i<s1.length()){
	               sum+=s1.charAt(i);
	           }
	           if(i<s2.length()){
	               sum+=s2.charAt(i);
	           }
	            
	        }
	        System.out.println(sum);
	}

}
