package String_Programs;

import java.util.Arrays;

public class Anagram_string {	//two string should have same character its called anagram
	
	public static void main(String[] args) {
		
        String s1="care";
        String s2="race";
        
       char[] ch1= s1.toCharArray();//convert string to character and store in array
       char[] ch2=s2.toCharArray();
       
       Arrays.sort(ch1);//[a,c,e,r]
       Arrays.sort(ch2);
       
       if(Arrays.equals(ch1,ch2)){
            System.out.println("Its anagram");
       }else{
        System.out.println("Its not an anagram");
       }
    }
	}


