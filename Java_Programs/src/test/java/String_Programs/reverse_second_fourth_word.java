package String_Programs;

public class reverse_second_fourth_word {

	public static void main(String[] args) {
		
		String s ="i work in capgemini";
		String[] word=s.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String words:word) {
			if(words.equals("work")||words.equals("capgemini")) {
				result.append(new StringBuilder(words).reverse());
			}else {
				result.append(words);
			}
			result.append(" ");
		}
			
		
		System.out.println(result.toString());
	}
}

