package Array_Programs;

import java.util.Arrays;

public class shift {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
//		int temp = a[0];
//		
//		for(int i=0;i<a.length-1;i++) {//i<4
//			a[i]=a[i+1];
//		}
//		a[a.length-1]=temp;
		
		for(int j=0;j<3;j++) {
			int temp = a[0];
//			
			for(int i=0;i<a.length-1;i++) {//i<4
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));//when we call a tostring() is called,toString() is present in Arrays.
	}
	
	//multiple times 
	
	

}
