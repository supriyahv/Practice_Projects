package Array_Programs;

import java.util.Arrays;


public class add_array {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b= {2,3};
		int max=Math.max(a.length, b.length);//give maxmim array in length
		int[] sum = new int[max];
		
		for(int i=0;i<max;i++) {
			
			if(i<a.length) {
				sum[i]+=a[i];
			}
			
			if(i<b.length) {
				sum[i]+=b[i];
			}
		}
		
		System.out.println(Arrays.toString(sum));
		
	}

}
