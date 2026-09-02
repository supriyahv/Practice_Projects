package String_Programs;

public class compress_String {
	
	public static void main(String[] args) {
		
		String s ="aaabbbce";
//		int count=1;
//		
//		for(int i=0;i<s.length()-1;i++) {
//			if(s.charAt(i)==s.charAt(i+1)) {
//				count++;
//			}else {
//				System.out.println(s.charAt(i)+"---"+count);
//				count=1;
//			}
//		}
//			System.out.println(s.charAt(s.length()-1)+"---"+count);
		
		 
	        String res="";
	        for(int i=0;i<s.length();i++){
	            if( i==0||s.charAt(i)!=s.charAt(i-1)){
	                res+=s.charAt(i);
	               
	            }
	            
	        }
	        System.out.println(res);
		}
	}


