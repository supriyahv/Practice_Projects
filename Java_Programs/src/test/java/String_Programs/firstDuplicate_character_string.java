package String_Programs;

public class firstDuplicate_character_string {
	
	public static void main(String[] args) {
		
	
	
	  String s="hadapsarp";
      for(int i=0;i<s.length();i++){
          for(int j=i+1;j<s.length();j++){
              if(s.charAt(i)==s.charAt(j)){
                   System.out.println(s.charAt(i));
                   System.out.println(j);
                   return;//give only first position of duplicate character
              }
          }
      }
      System.out.println("Start small. Ship something.");

}
}
