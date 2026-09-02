package String_Programs;

import java.util.LinkedHashMap;



import java.util.Map;

public class Duplicate_character {
	public static void main(String[] args) {
		
		 String s="Hello";	//find duplicate character in string
	        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(map.containsKey(ch)){
	                map.put(ch,map.get(ch)+1);
	            }else{
	                map.put(ch,1);
	            }
	        }
	       for(Map.Entry<Character,Integer> entry:map.entrySet()){
	           if(entry.getValue()>1){
	               System.out.println(entry.getKey()+"--"+entry.getValue());
	           }
	       }
	}

}
