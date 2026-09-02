package Array_Programs;

import java.util.Arrays;

public class shift_right {
	
	public static void main(String[] args) {
		
		int[] a = {0,2,0,1,3,4};
		int[] b = new int[a.length];
		int index=0;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]!=0) {
				b[index++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
