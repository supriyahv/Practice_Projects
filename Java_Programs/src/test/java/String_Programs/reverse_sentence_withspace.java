package String_Programs;

public class reverse_sentence_withspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s="my name";
	        String s1=s.replace(" ","");
	        int index=s1.length()-1;//5
	        for(int i=0;i<=s.length()-1;i++){
	            if(s.charAt(i)==' '){
	                System.out.print(" ");
	            }else{
	              System.out.print(s1.charAt(index--)); 
	            }
	             
	        }

	}

}
