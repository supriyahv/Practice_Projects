package String_Programs;

public class Reverse_sentence_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s="I am in Pune";//4
	        String[] str=s.split(" ");//0-3
	        for(int i=str.length-1;i>=0;i--){
	            System.out.print(str[i]+" ");
	        }

	}

}
