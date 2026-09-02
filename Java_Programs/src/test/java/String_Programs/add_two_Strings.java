package String_Programs;

public class add_two_Strings {//same length
	
	public static void main(String[] args) {
		
		String s1="pune";
        String s2="1234";
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        System.out.println(sb);
	}

}
