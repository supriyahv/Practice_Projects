package Array_Programs;

public class Largest_Number_array {
	
	 public static void main(String[] args) {
	        int[] a={1,2,4,7,0};
	        int max=a[0];
	        for(int i=0;i<a.length;i++){
	            if(a[i]>max){
	                max=a[i];
	            }
	        }
	        System.out.println(max);
	    }

}
