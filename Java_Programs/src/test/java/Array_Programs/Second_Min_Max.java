package Array_Programs;

public class Second_Min_Max {
	
	public static void main(String[] args) {
		
		int[] a = {100,500,200,100,400};
		int max =a[0];
		int smax=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}else if(a[i]>smax && a[i]!=max) {
				smax=a[i];
			}
			
		}
		System.out.println(smax);
	}

}
