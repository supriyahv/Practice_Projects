package String_Programs;

import java.util.LinkedHashSet;

public class remove_duplicate {//remove duplicate character from String
	
	public static void main(String[] args) {
		 String s ="helloe";
		 String res="";
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(res.indexOf(ch)==-1) {
	            	res+=ch;
	            }
	        }
	        
	        
	        
	        System.out.println(res);
	}

}
