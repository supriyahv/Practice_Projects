package String_Programs;

public class sum_In_String {
	
	public static void main(String[] args) {
		
		String s ="123adb";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				sum = sum+ch-48;//char to integer 
			}
		}
		System.out.println(sum);
	}

}
