package String_Programs;

public class reverse_sentence {
	
	public static void main(String[] args) {
		
	
	
	  String s= "i am from punjab";
      String[] str=s.split(" ");
     
      for(String word:str){
          for(int i=word.length()-1;i>=0;i--){
              System.out.print(word.charAt(i));
          }
          System.out.print(" ");
          
      }
     
	 
  }

}
