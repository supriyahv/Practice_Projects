package String_Programs;

public class Expand_String {
	
	public static void main(String[] args) {
		
		String s ="a2b4c3";
	     for(int i=0;i<s.length();i=i+2){
	         char ch=s.charAt(i);
	         int count=s.charAt(i+1)-48;
	         for(int j=1;j<=count;j++){
	             System.out.println(ch);
	         }
	     }
	}

}
