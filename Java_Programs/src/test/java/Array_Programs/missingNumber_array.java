package Array_Programs;

public class missingNumber_array {
	
	public static void main(String[] args) {
		
		 int[] a={1,2,3,5};
	        int n=5;
	        int expectedsum=n*(n+1)/2;
	        int actualsum =0;
	        for(int i=0;i<a.length;i++){
	            actualsum=actualsum+a[i];
	        }
	        
	        int missingnum=expectedsum-actualsum;
	        System.out.println(missingnum);
	}

}
