package String_Programs;

public class reverse_simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="i am in capgemini";
        String[] str=s.split(" ");//i am in capgemini
        for(int j=str.length-1;j>=0;j--){//capgemini
            String word=str[j];//capgemini
            for(int i=word.length()-1;i>=0;i--){//inimegpac
                char ch =word.charAt(i);//i
                 System.out.print(ch);//i
            }
           System.out.print(" "); 
        }

	}

}
