package Array_Programs;

import java.util.Arrays;

public class Sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4,2,1,5};

		for(int i=0; i<a.length; i++) {//2
		    for(int j=i+1; j<a.length; j++) {//1
		        if(a[i] > a[j]) {//4>2,4>1
		            int temp = a[i];//4//4//2
		            a[i] = a[j];//2//1//1
		            a[j] = temp;//4//2
		        }
		    }
		}
		 System.out.print(Arrays.toString(a));
//		for(int num : a) {
//		    System.out.print(num);
//		}

	}

}
