package String_Programs;

public class special_digit_alphabet_String {
	
	public static void main(String[] args) {
		
		String s="12ab&###67i";
	     int digit=0;
	     int special=0;
	     int alphabet=0;
	     
	     for(int i=0;i<s.length();i++){
	         char ch=s.charAt(i);
	         if(ch>='a'&& ch<='z'| ch>='A' & ch<='Z'){
	             alphabet++;
	         }else if(ch>='0' && ch<='9'){
	             digit++;
	         }else{
	             special++;
	         }
	     }
	     System.out.println(digit+"---"+special+"---"+alphabet);
	}

}
