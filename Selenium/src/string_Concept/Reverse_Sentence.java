package string_Concept;

public class Reverse_Sentence {//
	
	public static void main(String[] args) {
		
		String s = "I know Java";
		String[] word=s.split(" ");//it will split sentence where space is there
		String reverseSentence="";//empty new string to store reveresed sentence
		

		
		for(String sw :word) {//fectch each word
			
			String reverseword="";//empty String to store reversed word
		for(int i=sw.length()-1;i>=0;i--) {//fetch each word
			reverseword=reverseword+sw.charAt(i);//get each cha
		}
		
		reverseSentence=reverseSentence+reverseword+" ";
		}
		System.out.println(reverseSentence);
	}

}
