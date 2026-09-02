package String_Programs;

public class reverse_words_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s="I am in Pune";
	        String[] words=s.split(" ");
	        for(String word:words){
	            String rev="";
	            if(word.equals("am")||word.equals("Pune")){
	                for(int i=word.length()-1;i>=0;i--){
	                    char ch=word.charAt(i);
	                    rev=rev+ch;
	                }
	                System.out.print(rev+" ");
	            }else{
	                System.out.print(word+" ");
	            }
	        }

	}

}
